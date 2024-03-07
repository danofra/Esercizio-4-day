import es1.Dipendente;
import es1.Dipartimento;

public class Main {

    public static void main(String[] args) {

        Dipendente d1 = new Dipendente(125, 1000, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente(423, 2500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente(23, 2000, Dipartimento.VENDITE);

        System.out.println("Dipendente 1: " + d1);
        System.out.println("Dipendente 2: " + d2);
        System.out.println("Dipendente 3: " + d3);

        d1.setDipartimento(Dipartimento.VENDITE);
        System.out.println("Dipendente 1: " + d1);

    }
}
