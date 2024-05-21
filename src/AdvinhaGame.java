 import java.util.Random;
import java.util.Scanner;

public class AdvinhaGame {
 public static void main(String[] args) {
       // Criando a leitura do computador da resposta do usuário
       Scanner leitor = new Scanner(System.in);

       // Criou uma variavel que recebe um numero aleatorio até 100
       int numeroAleatorio = new Random().nextInt(100);
       int tentativa = 0;
       int numeroDigitado = 0;
       // Criou um loop onde verifica condições para acertar ou não o numero gerado!
       while (tentativa < 5){
           System.out.println("Digite um número de 1 a 100.");
           numeroDigitado = leitor.nextInt();
           tentativa++;

           //Criou condições para verificar se o número digitado é maior, menos ou igual ao número gerado!

           if (numeroDigitado == numeroAleatorio){
               System.out.println("Parabéns! você acertou o número aleatório em: " + tentativa);
               break;
           }
           else if (numeroDigitado < numeroAleatorio) {
               System.out.println("O número digitado é menor que o número aleatório. Tente novamente! Tentativas: "+tentativa);
           }
           else {
               System.out.println("O número digitado é maior que o número aleatório. Tente novamente! Tentativas: " + tentativa);
           }
       }
       // Criou uma condição para verificar se quando estiver na ultima tentativa e não tiver acerto revelar o número gerado!
       if (tentativa == 5 && numeroDigitado != numeroAleatorio) {
           System.out.println("Você não conseguiu acertar o número aleatório! O número aleatório é: " + numeroAleatorio);
       }

   }

}
