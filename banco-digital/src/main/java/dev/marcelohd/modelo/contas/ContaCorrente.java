package dev.marcelohd.modelo.contas;

import dev.marcelohd.modelo.Cliente;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancariaImpl {

    public ContaCorrente(Cliente titularConta) {
        super(titularConta);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                " agenciaConta = " + getAgenciaConta() +
                ", numeroConta = " + getNumeroConta() +
                ", titularConta = " + getTitularConta() +
                ", ocorrencias = " + getOcorrencias().stream().toList() +
                '}';
    }

    @Override
    public void imprimiExtrato() {
        System.out.println(":::::::::::::::::::::::::: Extrato da Conta Corrente ::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::      INICIO DO EXTRATO    ::::::::::::::::::::::::::");
        super.imprimiExtrato();
        System.out.println("::::::::::::::::::::::::::        FIM DO EXTRATO     ::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::: Extrato da Conta Corrente ::::::::::::::::::::::::::");
    }
}
