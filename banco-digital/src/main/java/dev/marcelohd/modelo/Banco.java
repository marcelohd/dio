package dev.marcelohd.modelo;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Data
@NonNull
public class Banco {

    private String nomeBanco;
    private String numeroBanco;
    private String cnpjBanco;
    private Set<Agencia> agencias;

    public Banco() {
        this.agencias = new HashSet<>();
    }


}
