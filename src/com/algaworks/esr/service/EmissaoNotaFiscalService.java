package com.algaworks.esr.service;

import com.algaworks.esr.comunicacao.NotificacaoEmail;
import com.algaworks.esr.comunicacao.Notificador;
import com.algaworks.esr.modelo.Cliente;
import com.algaworks.esr.modelo.Produto;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService( Notificador notificador ) {
        this.notificador = notificador;
    }

    public void emitir( Cliente cliente, Produto produto ) {
        this.notificador.notificar( cliente, "Nota Fiscal do Produto "
        + produto.getNome() + " foi emitida!");
    }
}
