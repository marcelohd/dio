package dev.marcelohd.modelo.extrato;

import lombok.Getter;

@Getter
public enum Acoes {

    C(1,"Credito"),
    D(2,"Debito");


    private String nomeAcao;
    private int    codigoAcao;

    Acoes(int codigoAcao, String nomeAcao){
        this.codigoAcao = codigoAcao;
        this.nomeAcao = nomeAcao;
    }

}
