import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o número da sua conta: ");
        int numero = entrada.nextInt();
        System.out.println();
        System.out.print("Insira a sua agência: ");
        String agencia = entrada.next();
        System.out.println();
        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = entrada.next();
        entrada.next();
        System.out.println();
        System.out.print("Insira seu saldo: ");
        double saldo = entrada.nextDouble();
        System.out.println();
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s" +
                ", conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
