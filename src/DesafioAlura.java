import java.util.Scanner;

public class DesafioAlura {
    /*public static void main(String[] args) {
        // 1- Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número por favor");
        int numDigitado = leitor.nextInt();
        if (numDigitado >= 0){
            System.out.println("O seu número: " + numDigitado + " que você digitou é positivo");
        }else {
            System.out.println("O número: "+ numDigitado +" que você digitou é negativo" );
        }

        System.out.println(numDigitado);
    }*/


        //Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais, diferentes,
        // o primeiro é maior ou o segundo é maior.

    /*public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite Dois números inteiros!");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        if (num1 == num2){
            System.out.println("O primeiro número é igual ao segundo número!");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo número!");
        }
        else {
            System.out.println("O segundo número é maior!");
        }
    }*/

    //3-Crie um menu que oferece duas opções ao usuário:
    //"1. Calcular área do quadrado" e "2. Calcular área do círculo".
    //Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
   /* import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
*/
    //4- Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
    /*public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = leitor.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num +"x"+ i +" = " +(num * i));

        }
    }*/
    //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = leitor.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
            fatorial *= i;
        }
    }
}
