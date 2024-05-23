import Interfaces.Time;
import entities.*;
import enumes.Dipartimento;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new DipendenteFullTime(Dipartimento.VENDITE, 3000.00);
        Dipendente dipendente2 = new DipendentePartTime(Dipartimento.AMMINISTRAZIONE, 20.67, 100);
        Dipendente dipendente3 = new Dirigente(Dipartimento.PRODUZIONE, 5000.00, 500);
        Volontario volontario1 = new Volontario("Davide", 20, "CV1");
        Time[] times = {dipendente1, dipendente2, dipendente3, volontario1};

        for (int i = 0; i < times.length; i++) {
            times[i].checkIn();
            if (times[i] instanceof Dipendente) {
                Dipendente dipendente = (Dipendente) times[i];
                System.out.println("Il suo stipendio è " + dipendente.calculateSalary());
                System.out.println("-------------");
            }
        }
    }
}