package dev.marcelohd.modelo.extrato;

import dev.marcelohd.modelo.contas.Conta;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Ocorrencia {

    private LocalDateTime dataHora;
    private Acoes tipoAcao;
    private BigDecimal valorDaAcao;
    private String descricao;

}
