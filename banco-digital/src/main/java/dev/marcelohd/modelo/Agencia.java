package dev.marcelohd.modelo;

import dev.marcelohd.modelo.contas.Conta;
import dev.marcelohd.modelo.contas.ContaBancaria;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Data
public class Agencia {
    private static final String AGENCIA_PADRAO = "0114-X";
    private String numeroBanco;
    private String numeroAgencia;
    private String gerenteAgencia;
    private Set<ContaBancaria> contas;

    public Agencia() {
        this.contas = new HashSet<>();
        this.numeroAgencia = AGENCIA_PADRAO;
    }
}
