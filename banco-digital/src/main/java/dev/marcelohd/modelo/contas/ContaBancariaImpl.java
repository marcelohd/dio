package dev.marcelohd.modelo.contas;

import dev.marcelohd.modelo.Cliente;
import dev.marcelohd.modelo.extrato.Acoes;
import dev.marcelohd.modelo.extrato.Ocorrencia;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class ContaBancariaImpl extends ContaBancaria {

    public ContaBancariaImpl(Cliente titularConta) {
        super(titularConta);
    }

    @Override
    public void imprimiExtrato() {
        System.out.println(" Numero da agencia " + getAgenciaConta());
        System.out.println(" Numero da conta " + getNumeroConta());
        System.out.println(" Numero da Titular " + getTitularConta());
        System.out.println(" Saldo da atual R$ " + getSaldoConta());
        getOcorrencias().stream().forEach((o) -> System.out.println(" " + o.getTipoAcao().getNomeAcao()+" de " + o.getValorDaAcao() + " na data de " + o.getDataHora()));
    }

    @Override
    public boolean sacar(BigDecimal valorSaque) {
        boolean efetuado = false;
        if(getSaldoConta().compareTo(valorSaque) < 0 || getSaldoConta().compareTo(BigDecimal.ZERO) == 0){
            System.out.println("Saldo insuficiente");
            return efetuado;
        } else {
            setSaldoConta(getSaldoConta().subtract(valorSaque));
            System.out.println("Saque no valor de R$ " + valorSaque + " realizado com sucesso !!!");
            System.out.println("Saldo disponivel de R$ " + getSaldoConta());
            getOcorrencias().add(new Ocorrencia(LocalDateTime.now(), Acoes.D, valorSaque, "Saque no valor de R$ " + valorSaque + " realizado com sucesso !!! "));
            efetuado = true;
        }
        return efetuado;
    }

    @Override
    public void deposito(BigDecimal valorDeposito) {
        if(valorDeposito.compareTo(BigDecimal.ZERO)  > 0 ){
           setSaldoConta(getSaldoConta().add(valorDeposito));
           System.out.println("Deposito no valor de R$ " + valorDeposito + " realizado com sucesso !!!");
           System.out.println("Saldo disponivel de R$ " + getSaldoConta());
           getOcorrencias().add(new Ocorrencia(LocalDateTime.now(),Acoes.C,valorDeposito,"Deposito no valor de R$ " + valorDeposito + " , realizado com sucesso !!!"));

        }

    }

    @Override
    public void transferencia(BigDecimal valorTranferencia, ContaBancaria contaDestino) {
        if(sacar(valorTranferencia)){
            contaDestino.deposito(valorTranferencia);
            System.out.println("Transferindo o valor " + valorTranferencia + " da conta " + getNumeroConta() + " para a conta " + contaDestino.getNumeroConta());
            System.out.println("Saldo disponivel de R$ " + getSaldoConta());
         }

    }

}
