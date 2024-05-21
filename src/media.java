public class media {
    public static void main(String[]args){
        /*double notaA = 7.5;
        double notaB = 9.3;

        int media = (int)(notaA + notaB) / 2;
        System.out.println(media);
        char letra = 'A';
        String frase = " média do aluno(a) foi boa!";
        String fraseCompleta = letra + frase;
        System.out.println(fraseCompleta);*/

        double precoProduto = 50.99;
        int quantidade = 4;
        int valorTotal = (int) precoProduto * quantidade;
        String mensagem = String.format("O valor da multiplicação do preço pela quantidade é igual: R$ %d,00", valorTotal);
        System.out.println("O valor da multiplicação do preço do produto pela quantidade é igual: "+ valorTotal);
        System.out.println(mensagem);
    }
}
