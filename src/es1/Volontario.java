package es1;

public class Volontario implements CheckIn {
    private String name;
    private int età;
    private String CV;

    public Volontario(String name, int età, String CV) {
        this.name = name;
        this.età = età;
        this.CV = CV;
    }

    @Override
    public void CheckIn() {
        System.out.println("Il volontario " + this.name + " inizia il suo turno di lavoro alle 9:00");
        ;
        System.out.println("Il volontario " + this.name + " termina il suo turno di lavoro alle 18:00 ");
    }

}
