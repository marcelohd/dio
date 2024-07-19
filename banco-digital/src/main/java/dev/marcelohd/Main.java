package dev.marcelohd;

import dev.marcelohd.modelo.Agencia;
import dev.marcelohd.modelo.Banco;
import dev.marcelohd.modelo.Cliente;
import dev.marcelohd.modelo.contas.Conta;
import dev.marcelohd.modelo.contas.ContaBancaria;
import dev.marcelohd.modelo.contas.ContaCorrente;
import dev.marcelohd.modelo.contas.ContaPoupanca;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import javax.swing.text.IconView;
import java.math.BigDecimal;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco bancoDoBrasil = new Banco();
        bancoDoBrasil.setNomeBanco("Banco do Brasil");
        bancoDoBrasil.setNumeroBanco("001");
        bancoDoBrasil.setCnpjBanco("00.000.000/0001-91");

        Agencia agenciaBancoDoBrasil = new Agencia();
        agenciaBancoDoBrasil.setNumeroBanco(bancoDoBrasil.getNumeroBanco());
        agenciaBancoDoBrasil.setGerenteAgencia("Maria Antonieta");
        bancoDoBrasil.getAgencias().add(agenciaBancoDoBrasil);

        ContaCorrente corrente = new ContaCorrente(new Cliente("Jose da Silva","518.200.390-05"));
        ContaCorrente correnteDois = new ContaCorrente(new Cliente("Sebastiao Goncalves","712.773.660-04"));
        ContaPoupanca poupanca = new ContaPoupanca(new Cliente("Antonio Dias","712.773.660-04"));

        agenciaBancoDoBrasil.getContas().add(corrente);
        agenciaBancoDoBrasil.getContas().add(poupanca);
        agenciaBancoDoBrasil.getContas().add(correnteDois);

        corrente.imprimiExtrato();
        poupanca.imprimiExtrato();

        System.out.println();
        corrente.deposito(BigDecimal.valueOf(750.00));
        corrente.sacar(BigDecimal.valueOf(25));
        corrente.transferencia(BigDecimal.valueOf(25),poupanca);
        poupanca.deposito(BigDecimal.valueOf(1000.00));
        System.out.println();
        corrente.imprimiExtrato();
        poupanca.imprimiExtrato();

        System.out.println("Lista de agencias");
        bancoDoBrasil.getAgencias().stream().forEach((a)-> System.out.println("Nome do Banco : "+ bancoDoBrasil.getNomeBanco() + ", Agência : " + a.getNumeroAgencia() + ", Gerente : " + a.getGerenteAgencia()));
        agenciaBancoDoBrasil.getContas().stream().forEach((c)-> System.out.println("Titular da conta : " + c.getTitularConta() +", Numero da agencia : "+ c.getAgenciaConta() +", Numero da conta : " + c.getNumeroConta() ));

    }
}