package entities;

import Interfaces.Time;

public class Volontario implements Time {

    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCV() {
        return CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario di nome " + nome + " ha iniziato il suo servizio");
    }
}
