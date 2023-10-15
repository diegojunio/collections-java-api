package Eventos;

import Pesquisa.AgendaContatos;
import com.sun.jdi.LongValue;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá em " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(
                2023,
                Month.JULY,
                15),
                "Evento 1",
                "Atracao 1"
        );

        agendaEventos.adicionarEvento(LocalDate.of(
                2023,
                7,
                9),
                "Evento 2",
                "Atracao 2"
        );

        agendaEventos.adicionarEvento(LocalDate.of(
                2000,
                7,
                1),
                "Evento 3",
                "Atracao 3"
        );

        agendaEventos.adicionarEvento(LocalDate.of(
                2023,
                12,
                5),
                "Evento 4",
                "Atracao 4"
        );

        agendaEventos.adicionarEvento(LocalDate.of(
                2023,
                10,
                15),
                "Evento 5",
                "Atracao 5"
        );

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
