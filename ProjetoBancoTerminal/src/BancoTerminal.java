import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {

        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pelo Scanner os valores digitados no terminal

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da conta (Ex: 1234): ");
        String numeroConta = leitor.nextLine();
        int numConta = Integer.parseInt(numeroConta);

        System.out.println("Digite o número da agencia (Ex: 067-8): ");
        String agencia = leitor.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = leitor.nextLine();

        System.out.println("Digite quanto deseja de saldo de entrada: ");
        String saldo = leitor.nextLine();
        double saldoConvertidoEmDouble = Double.parseDouble(saldo);

        leitor.close();

        // Exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente+"! Obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agencia+", a conta é "+numConta+" e seu saldo é "+saldoConvertidoEmDouble+" já está disponível para saque");

    }



}
