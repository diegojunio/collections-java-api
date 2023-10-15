package tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        listatarefa.adicionarTarefa("tarefas.Tarefa 1");
        listatarefa.adicionarTarefa("tarefas.Tarefa 2");
        listatarefa.adicionarTarefa("tarefas.Tarefa 3");

        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalDeTarefas());
        listatarefa.removerTarefa("tarefas.Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalDeTarefas());
        listatarefa.obterDescricoesTarefas();
    }

}
