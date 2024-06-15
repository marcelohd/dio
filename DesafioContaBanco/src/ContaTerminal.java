import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO : Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        
        // TODO : Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Numero da Conta !");
        String numeroConta = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta !");
        String saldoConta = scanner.nextLine();
        
          // TODO : Obter pela classe Scanner os valores
        System.out.println("\"Olá "+nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia+ ", conta " + numeroConta+ " e seu saldo "+ saldoConta + " já está disponível para saque\".");
    }   
}
