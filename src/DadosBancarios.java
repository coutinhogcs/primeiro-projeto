import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("Dados do Cliente:");
        System.out.println("Nome do cliente: Guilherme Coutinho");
        System.out.println("Tipo de conta: Conta Corrente");
        System.out.println("Saldo em conta: R$ 3500,00");
        System.out.println("********************************");
        int menu = 0;

        while (menu != 4){
            System.out.println("""
                Operações
                1) Consultar saldo
                2) Receber valor
                3) Transferir valor
                4) Sair""");
            System.out.println("Escolha uma operação: ");
            menu  = leitor.nextInt();
            int saldo = 2500;
            if (menu == 1){
                System.out.println("*Seu saldo é igual: " + saldo);
            } else if (menu == 2) {
                System.out.println("Quanto você quer receber? \n");
                int receberValor = leitor.nextInt();
                System.out.println("*Você recebeu: R$" + receberValor + " seu saldo atual é de RS "+ (receberValor+ saldo)+",00");
            }else if (menu == 3) {
                System.out.println("Quanto você quer transferir?");
                int transfere = leitor.nextInt();
                System.out.println("*Valor de transferencia é de: R$"+ transfere + " saldo atual: " + (transfere - saldo));
            }
            else if (menu == 4) {
                System.out.println("*Operação Encerrada!");
                break;
            }else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
