package Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Diego", 123456);
        agendaContatos.adicionarContatos("Diego Junio", 123456);
        agendaContatos.adicionarContatos("Diego Santos", 123456);
        agendaContatos.adicionarContatos("Erick", 456789);
        agendaContatos.adicionarContatos("Samuel", 987321);
        agendaContatos.adicionarContatos("Priscila", 955951);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquiserPorNome("Diego"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Diego", 999999));

    }
}
