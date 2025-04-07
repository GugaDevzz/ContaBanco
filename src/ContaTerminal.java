import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomedoCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        Agencia = scanner.nextLine();

        System.out.println("Qual Seu Primeiro e Segundo nome?");
        NomedoCliente = scanner.nextLine();

        System.out.println("Digite o número da conta");
        Numero = scanner.nextInt();

        System.out.println("Deposite seu saldo inicial");
        saldo = scanner.nextInt();

        System.out.println("Olá " + NomedoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
