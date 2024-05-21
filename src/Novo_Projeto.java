import java.util.Scanner;

public class Novo_Projeto {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String conta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta " + conta);
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir Valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: "+saldo);
            }
            else if (opcao ==2 ) {
                System.out.println("Qual valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                }
                else{
                    saldo -= valor;
                    System.out.println("Valor transferido: R$" + valor +". Saldo atual: "+saldo);
                }
            }
            else if (opcao == 3) {
                double valor = leitura.nextDouble();
                System.out.println("Valor Recebido: "+ valor);
                saldo += valor;
            }
            else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
