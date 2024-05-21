public class temperatura {
    public static void main(String[]args){
      double  temperaturaEmC = 30.4;
      int fahrenheit = (int) (temperaturaEmC * 1.8) + 32;
        String mensagem = String.format("A transformação de %.2f graus Celcius em Fahrenheit é igual: %d°F", temperaturaEmC, fahrenheit);
        System.out.println(mensagem);
    }
}
