package dev.marcelohd.modelo.contas;

import dev.marcelohd.modelo.Cliente;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter

public class ContaPoupanca extends ContaBancariaImpl {
    public static final String TIPOCONTA = ContaPoupanca.class.getCanonicalName();

    private Integer variacao;

    public ContaPoupanca(Cliente titularConta) {
        super(titularConta);
        this.variacao = 51;
    }

    @Override
    public void imprimiExtrato() {
        System.out.println(":::::::::::::::::::::::::: Extrato da Conta POUPANÇA ::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::      INICIO DO EXTRATO    ::::::::::::::::::::::::::");
        System.out.println(" Variacao : " + getVariacao());
        super.imprimiExtrato();
        System.out.println("::::::::::::::::::::::::::        FIM DO EXTRATO     ::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::: Extrato da Conta POUPANÇA ::::::::::::::::::::::::::");

    }


    @Override
    public String toString() {
        return "ContaPoupanca{" +
                " agenciaConta = " + getAgenciaConta() +
                ", numeroConta = " + getNumeroConta() +
                ", titularConta = " + getTitularConta() +
                ", variacao = " + getVariacao() +
                ", ocorrencias = " + getOcorrencias().stream().toList() +
                '}';
    }
}
