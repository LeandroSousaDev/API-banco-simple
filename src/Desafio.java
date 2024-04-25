import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int opcao = 0;

        String nome = "Leandro Sousa";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("#############################");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n#############################");

       String menu = """
                ** Digite a sua opção **
                1 - Cosulta Saldos
                2 - Receber valor
                3 - Transferir valor
                4 - sair
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja receber");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo agora é de: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Quanto deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Seu saldo agora é de: " + saldo);
                }
            } else if (opcao != 4 || opcao <= 0) {
                System.out.println("Opção invalida");
            }
        }

    }
}
