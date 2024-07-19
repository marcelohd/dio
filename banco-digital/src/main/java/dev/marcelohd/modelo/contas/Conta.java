package dev.marcelohd.modelo.contas;

import java.math.BigDecimal;

public interface Conta {
    boolean sacar(BigDecimal valorSaque);

    void deposito(BigDecimal valorDeposito);

    void transferencia(BigDecimal valorTranferencia, ContaBancaria contaDestino);
}
