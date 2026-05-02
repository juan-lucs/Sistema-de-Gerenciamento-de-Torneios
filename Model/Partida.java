package Model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Partida {
    private Time time1;
    private Time time2;
    private LocalDate Date;
    private Map<Time, Integer> placar = new HashMap<>();

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public void setPlacar(Time nome) {
        placar.put(nome, 0);
    }

    public Map<Time, Integer> getPlacar() {
        return new HashMap<>(placar); // MESMA COISA QUE O SET, CRIA UM NOVO PARA PROTECAO E BOA PRATICA
    }

}


