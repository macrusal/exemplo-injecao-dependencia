package com.algaworks.esr.comunicacao;

import com.algaworks.esr.modelo.Cliente;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public interface Notificador {

    void notificar( Cliente cliente, String mensagem );
}
