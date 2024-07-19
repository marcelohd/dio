package dev.marcelohd.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

    private String nomeCliente;
    private String nroDocumento;

    @Override
    public String toString() {
        return  nomeCliente + " - Documento : "+ nroDocumento;
    }
}
