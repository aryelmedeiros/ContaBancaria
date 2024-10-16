import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcao = "s";
        do{
            System.out.println("Bem Vindo ao Banco Virtual \nAperte 'n' para sair?");
            opcao = scanner.nextLine();
            if(opcao.equals("s") ){
                System.out.println("Digite seu nome completo:");
                String nome_cliente = scanner.nextLine();
                System.out.println("Digite sua agência bancaria:");
                String agencia = scanner.nextLine();
                System.out.println("Digite o numero da conta:");
                int num_conta = scanner.nextInt();
                System.out.println("Digite o saldo da conta:");
                int saldo = scanner.nextInt();

                System.out.println("Olá " +nome_cliente +
                       ",  obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta "+ num_conta + " e seu saldo "+saldo+ " já está disponível para saque");
            }

        }while(!opcao.equals("n"));
    }
}