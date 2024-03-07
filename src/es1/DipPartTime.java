package es1;

public class DipPartTime extends Dipendente {

    public DipPartTime(int matricola, double salario, Dipartimento dipartimento) {
        super(matricola, salario, dipartimento);
    }

    public double calculateSalary() {
        return super.getSalario() / 4 / 20;

    }

    @Override
    public String toString() {
        return "{" +
                " matricola: " + super.getMatricola() + "" +
                ", salario: " + super.getSalario() + "" +
                ", dipartimento: " + super.getDipartimento() + "" +
                ", il dipendente è PartTime e ha un salario di " + calculateSalary() + " € l'ora per 20h settimanali."
                +
                "}";
    }
}
