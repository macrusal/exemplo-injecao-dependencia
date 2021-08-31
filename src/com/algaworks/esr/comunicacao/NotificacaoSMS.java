package com.algaworks.esr.comunicacao;

import com.algaworks.esr.modelo.Cliente;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class NotificacaoSMS implements Notificador {

    @Override
    public void notificar( Cliente cliente, String mensagem ) {
        System.out.printf("Notificação enviada, o cliente %s receberá o SMS através do telefone %s: %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
