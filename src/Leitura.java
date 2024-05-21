import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual foi o ano de lançamento deste filme?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual é a nota do filme?");
        double nota = leitura.nextDouble();
        String msg = String.format("O filme que você enviou é o %s o ano de lançamento foi em: %d e a sua nota é %.2f", filme, anoDeLancamento, nota);
        System.out.println(msg);

    }
}
