package Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void  removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);


        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();
        //        System.out.println("O número é: " + agendaContatos.pesquiserPorNome("Camila"));
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));

    }
}