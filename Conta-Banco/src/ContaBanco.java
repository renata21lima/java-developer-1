import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = meuScanner.nextInt();

        System.out.println("Por favor, digite a Agencia !");
        agencia = meuScanner.next();

        System.out.println("Por favor, digite o seu Nome !");
        nomeCliente = meuScanner.next();

        System.out.println("Por favor, digite o saldo da Conta ! R$");
        saldo = meuScanner.nextInt();

        System.out.println(
                "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + numeroConta +
                " e seu saldo de R$ " + saldo + " já está disponível para saque."
            );

        meuScanner.close();
    }
}
