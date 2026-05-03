package Service;

import Interfaces.*;
import Model.Partida;
import Model.Time;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TorneioService implements Exportavel, Classificavel, Estatistico {
    Map<Time, Integer> pontosDeCadaTime = new HashMap<>();
    Set<Time> times = new HashSet<>();
    Set<Partida> partidas = new HashSet<>();

    public void registrarPartida(String time1, String time2, LocalDate dataPartida) {
        for (Time t : times) {
            if (t.getNome().equals(time1)) {
                for (Time t2 : times) {
                    if (t2.getNome().equals(time2)) {
                        Partida p = new Partida(t, t2, dataPartida);
                        partidas.add(p);
                    }
                }
            }
        }
    }
    @Override
    public String getDados() {
        return ""; //arrumar!!!!!!!!!!!!!!!
    }
    @Override
    public int getPontuacao() {
     return 0; // arrumar!!!!!!!!!!!!!!!
    }
    @Override
    public String getTotalPartidas() {
        return ""; // arrumar!!!!!!!!!!!
    }

   // default void getResumo() {System.out.println("Total das partidas: " + getTotalPartidas());}
    //     default void exportar() {
}
