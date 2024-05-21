import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota;
        double mediaAv = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as suas notas: ");
            nota = leitura.nextDouble();
            mediaAv += nota / 3;
        }
        String msgAprovado = String.format("Sua média nas avaliações foi de: %.2f . Você está aprovado, parabéns!", mediaAv);
        String msgReprovado = String.format("Sua média nas avaliações foi de: %.2f . Você está reprovado!", mediaAv);
        if (mediaAv < 5.75){
            System.out.println(msgReprovado);
        }else {
            System.out.println(msgAprovado);
        }
    }
}
