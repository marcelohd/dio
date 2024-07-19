package dev.marcelohd.modelo.contas;


import dev.marcelohd.modelo.Cliente;
import dev.marcelohd.modelo.extrato.Ocorrencia;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public abstract class ContaBancaria implements Conta {
    private static final String AGENCIA_PADRAO = "0114-X";
    private static int SEQUENCIAL = new Random().nextInt(10000);

    private String agenciaConta;
    private int numeroConta;
    private Cliente titularConta;
    private BigDecimal saldoConta;
    private List<Ocorrencia> ocorrencias;

    public ContaBancaria(Cliente titularConta){
        this.agenciaConta = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.titularConta = titularConta;
        this.saldoConta = new BigDecimal(0);
        this.ocorrencias = new ArrayList<>();

    }

    public abstract void imprimiExtrato();

}
