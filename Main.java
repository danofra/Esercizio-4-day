import es1.Dipendente;
import es1.Volontario;
import es1.CheckIn;
import es1.DIpDirigente;
import es1.DipFullTime;
import es1.DipPartTime;
import es1.Dipartimento;

public class Main {

    public static void main(String[] args) {

        Dipendente d1 = new DipPartTime(125, 1000, Dipartimento.PRODUZIONE);
        Dipendente d2 = new DipFullTime(423, 2500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new DIpDirigente(23, 2000, Dipartimento.VENDITE);
        Volontario v1 = new Volontario("Ugo Fantozzi", 25, "CV1.pdf");
        Volontario v2 = new Volontario("Franco e Ciccio", 35, "CV2.pdf");
        Volontario v3 = new Volontario("Pasquale Zagaria", 45, "CV3.pdf");
        d1.setDipartimento(Dipartimento.VENDITE);
        d2.setDipartimento(Dipartimento.PRODUZIONE);
        d3.setDipartimento(Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendentiSalariati = { d1, d2, d3 };
        for (Dipendente dip : dipendentiSalariati) {
            System.out.println("Dipendente: " + dip.toString());
        }

        CheckIn[] dipendenti = { d1, d2, d3, v1, v2, v3 };
        for (CheckIn dip : dipendenti) {
            dip.CheckIn();
        }

    }
}
