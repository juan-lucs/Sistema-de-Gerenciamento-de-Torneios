package Service;

import Interfaces.*;
import Model.*;
import enums.*;
import exeption.*;
import repository.*;

import java.time.LocalDate;
import java.util.*;

public class TorneioService implements Exportavel, Classificavel, Estatistico {
    Map<Time, Integer> pontosDeCadaTime = new HashMap<>();
    Set<Time> times = new HashSet<>();
    Set<Partida> partidas = new HashSet<>();

    public Map<Time, Integer> rankingtorneio() {
        List pontost = new ArrayList<>();
        for (Map.Entry<Time, Integer> entry : pontosDeCadaTime.entrySet()) { // Entryset retorna um SET com chave-valor de cada item, cada chave-valor é tratado como entry dentro do fo
            Time time = entry.getKey();
            Integer pontos = entry.getValue();
            pontost.add(pontos);
        }
        Collections.sort(pontost);
        for (Map.Entry<Time, Integer> entry : pontosDeCadaTime.entrySet()) {
            Time time = entry.getKey();
            Integer pontos = entry.getValue();
            System.out.println();
        }
        return new HashMap<Time, Integer>(pontosDeCadaTime);
    }

    //ESSE NOME TIME RECEBE APENAS O NOME DO TIME                       // ESSE JOGADOR RECEBE UM NEW JOGADOR(nome, posicao, idade)
    public void adicionarJogadorTime (String nometime, Jogador jogador) {
        Time time = null;
        for (Time t : times) {
            if (t.getNome().equals(nometime)) {
                time = t; // ENCONTROU O TIME1, GUARDA O OBJETO
                break;  // PARA O LOOP, NÃO PRECISA CONTINUAR PROCURANDO
            }
            if (time == null) {
                System.out.println("O time não existe ou o nome está incorreto!");
                return;
            }

            time.setJogador(jogador);
            System.out.println("jogador adicionado ao time " + time + " com suceeso!");
        }

    }
    public void cadastrarTime(String nomeTime, Modalidade modalidade) {
        Time t = new Time(nomeTime, modalidade);
        times.add(t);
        System.out.println("Time cadastrado com sucesso!");
    }

    public void registrarPartida(String time1, String time2, LocalDate dataPartida, int pntstime1, int pntstime2) {
        Time t1 = null; // VAI GUARDAR O OBJETO TIME DO TIME1, COMEÇA NULO
        Time t2 = null; // VAI GUARDAR O OBJETO TIME DO TIME2, COMEÇA NULO

        for (Time t : times) {
            if (t.getNome().equals(time1)) {
                t1 = t; // ENCONTROU O TIME1, GUARDA O OBJETO
                break;  // PARA O LOOP, NÃO PRECISA CONTINUAR PROCURANDO
            }
            // NÃO TEM ELSE AQUI POR UMA RAZÃO:
            // O ELSE RODARIA PARA CADA TIME QUE NÃO FOR O TIME1
            // EX: SE TIMES = [FLAMENGO, CORINTHIANS, PALMEIRAS E BUSCAMOS "FLAMENGO"
            // -> CORINTHIANS NÃO É FLAMENGO → ELSE RODA
            // -> PALMEIRAS NÃO É FLAMENGO   → ELSE RODA
            // O ELSE SÓ FUNCIONA COM IF ISOLADO, NÃO DENTRO DE UM LOOP
        }

        for (Time t : times) {
            if (t.getNome().equals(time2)) {
                t2 = t; // ENCONTROU O TIME2, GUARDA O OBJETO
                break;  // PARA O LOOP
            }
        }

        // SÓ AQUI, DEPOIS QUE OS LOOPS TERMINARAM, É POSSÍVEL SABER SE ENCONTROU OU NÃO
        // SE AINDA FOR NULO, É PORQUE NÃO ENCONTROU EM NENHUM DOS TIMES
        if (t1 == null || t2 == null) {
            System.out.println("Um ou ambos os times não existem. Verifique os nomes e tente novamente.");
            return; // EARLY RETURN: ENCERRA O MÉTODO, NÃO CRIA A PARTIDA
        }

        partidas.add(new Partida(t1, t2, dataPartida)); // AMBOS ENCONTRADOS, CRIA E REGISTRA A PARTIDA
        pontosDeCadaTime.put(t1, pontosDeCadaTime.getOrDefault(t1, 0) + pntstime1);
        pontosDeCadaTime.put(t2, pontosDeCadaTime.getOrDefault(t2, 0) + pntstime2);
        System.out.println("Partida adicionada com sucesso!");
    }
    public Map<Time, Integer> getPontosTime() {
        return new HashMap<Time, Integer>(pontosDeCadaTime);
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
