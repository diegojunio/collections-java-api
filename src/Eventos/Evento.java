package Eventos;

public class Evento {
    private String nome;
    private String atracao;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}' + "\n";
    }

    public String getAtracao() {
        return atracao;
    }

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }


}
