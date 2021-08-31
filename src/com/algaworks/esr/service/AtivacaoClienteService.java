package com.algaworks.esr.service;

import com.algaworks.esr.comunicacao.Notificador;
import com.algaworks.esr.modelo.Cliente;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService( Notificador notificador ) {
        this.notificador = notificador;
    }

    public void ativar( Cliente cliente ) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Cadastro ativado com sucesso!");
    }
}
