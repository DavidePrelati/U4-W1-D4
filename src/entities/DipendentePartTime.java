package entities;

import enumes.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private double pagamentoPerOre;
    private int ore;

    public DipendentePartTime(Dipartimento dipartimento, double pagamentoPerOre, int ore) {
        super(dipartimento);
        this.pagamentoPerOre = pagamentoPerOre;
        this.ore = ore;

    }

    @Override
    public double calculateSalary() {
        return ore * pagamentoPerOre;
    }
}
