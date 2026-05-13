package Main;
import Service.*;

import Model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramMain {
public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("=== SISTEMA DE TORNEIOS ===\n");
    while(true){
        try {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Cadastrar time");
            System.out.println("2. Adicionar jogador a um time");
            System.out.println("3. Registrar partida");
            System.out.println("4. Ver ranking");
            System.out.println("5. Exibir resumo do torneio");
            System.out.println("6. Exportar ranking para arquivo");
            System.out.println();
            switch (sc.nextInt()){
                case 1:
                    System.out.println("\n\n");
                    break;
                case 2:
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("\n\n");
                    break;
                case 4:
                    System.out.println("\n\n");
                    break;
                case 5:
                    System.out.println("\n\n");
                    break;
                case 6:
                    System.out.println("\n\n");
                    break;
                    default:
                        break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Digite apenas a opção desejada!");
        }
    }





       //feito //1. Cadastrar time
       //feito //2. Adicionar jogador a um time
       //feito //3. Registrar partida
        //4. Ver ranking /exibe todos os times cadastrados no torneio ordenados pela pontuação, do maior para o menor. Mostra o nome do time e quantos pontos ele tem acumulados até agora.
//    TorneioService sc = new TorneioService();
//    System.out.println(sc.rankingTorneio().size());
//    for (Map.Entry<Time, Integer> entry : sc.rankingTorneio()) {
//
//        System.out.println(
//                entry.getKey().getNome() + " - " +
//                        entry.getValue() + " pontos"
//        );
//    }

    //5. Exibir resumo do torneio /mostra uma visão geral do torneio: quantos times estão participando, quantas partidas já foram registradas
        //6. Exportar ranking para arquivo /faz a mesma coisa do "ver ranking", mas em vez de exibir no console, salva essas informações num arquivo ranking.txt usando o BufferedWriter. É aqui que entra o Exportavel e o Exportador da pasta util
        //7. Finalizar torneio
        //0. Sair
    }
}