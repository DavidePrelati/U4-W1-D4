package entities;

import enumes.Dipartimento;

public class Dirigente extends Dipendente {

    private double stipendioMensile;
    private double extra;

    public Dirigente(Dipartimento dipartimento, double stipendioMensile, double extra) {
        super(dipartimento);
        this.stipendioMensile = stipendioMensile;
        this.extra = extra;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile + extra;
    }
}
