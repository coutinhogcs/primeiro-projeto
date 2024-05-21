import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double nota = 0;
            double mediaAv = 0;
            int i = 0;

            while (nota != -1){
                System.out.println("Digite sua nota ou -1 para sair!");
                nota = leitura.nextDouble();
                if (nota != -1){
                    mediaAv += nota;
                    i++;
                }
            }
        System.out.println("Média das avaliações é: " + mediaAv/i);
    }
}
