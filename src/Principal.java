import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Poor Things");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracao(180);

        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println("Média do filme: " + meuFilme.pegaMedia());
        System.out.println("A partir de avaliações: "+meuFilme.getTotalDeAvaliacoes());
    }

}