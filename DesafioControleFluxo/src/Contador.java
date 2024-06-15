import java.util.InputMismatchException;
import java.util.Scanner;


import exception.ParametrosInvalidosException;


public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        try{
            System.out.println("Entra com o primeiro parâmetro " );
            int parametroUm = terminal.nextInt();
            System.out.println("Entre com o segundo parâmetro " );
            int parametroDois = terminal.nextInt();
    
            contar(parametroUm,parametroDois);
        } catch( ParametrosInvalidosException ex){
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
        } catch( InputMismatchException ex) {
            System.out.println("Os parâmetros devem ser números inteiros");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int diferenca = 0;
        if(parametroDois > parametroUm)
            diferenca =  parametroDois - parametroUm;
        else {
           throw new ParametrosInvalidosException();
        }

        for(int idx = 1; idx <= diferenca; idx++){
            System.out.println("Imprimindo o número " + idx);
        }
    }
}
