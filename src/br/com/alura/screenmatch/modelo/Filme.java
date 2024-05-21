package br.com.alura.screenmatch.modelo;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracao;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;

   public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void exibeFichaTecnica() {
        System.out.println("**************************************");
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Duração em minutos " + duracao + " minutos");
        System.out.println("**************************************");
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes/totalDeAvaliacoes;
    }
}