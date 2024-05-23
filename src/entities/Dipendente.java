package entities;

import Interfaces.Time;
import enumes.Dipartimento;

import java.util.Random;

public abstract class Dipendente implements Time {

    private int matricola;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 10000);
        this.dipartimento = dipartimento;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Il dipendente con matricola " + matricola + " ha iniziato il suo turno di lavoro");
    }
}
