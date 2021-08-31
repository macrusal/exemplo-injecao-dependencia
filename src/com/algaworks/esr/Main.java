package com.algaworks.esr;

import com.algaworks.esr.comunicacao.NotificacaoEmail;
import com.algaworks.esr.comunicacao.NotificacaoSMS;
import com.algaworks.esr.comunicacao.Notificador;
import com.algaworks.esr.modelo.Cliente;
import com.algaworks.esr.service.AtivacaoClienteService;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class Main {

    public static void main( String[] args ) {
        Cliente marcelo = new Cliente( "Marcelo", "marcelo@email.com", "11-90001-0001" );
        Cliente victor = new Cliente( "Victor", "victor@email.com", "11-92000-2000" );

        Notificador notificador = new NotificacaoSMS();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar( marcelo );
        ativacaoClienteService.ativar( victor );
    }
}
