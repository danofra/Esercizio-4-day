package es1;

public abstract class Dipendente {
    private int matricola;
    private double salario;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double salario, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.salario = salario;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getSalario() {
        return salario;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "{" +
                " matricola='" + getMatricola() + "'" +
                ", salario='" + getSalario() + "'" +
                ", dipartimento='" + getDipartimento() + "'" +
                "}";
    }

}
