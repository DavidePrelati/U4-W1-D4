package entities;

import enumes.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    private double stipendioMensile;

    public DipendenteFullTime(Dipartimento dipartimento, double stipendioMensile) {
        super(dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }


}
