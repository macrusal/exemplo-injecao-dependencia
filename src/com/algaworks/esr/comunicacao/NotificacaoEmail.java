package com.algaworks.esr.comunicacao;

import com.algaworks.esr.modelo.Cliente;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class NotificacaoEmail implements Notificador {

    @Override
    public void notificar( Cliente cliente, String mensagem ) {
        System.out.printf("Notificação enviada para o cliente %s através do e-mail %s: %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
