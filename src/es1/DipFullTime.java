package es1;

public class DipFullTime extends Dipendente {

    public DipFullTime(int matricola, double salario, Dipartimento dipartimento) {
        super(matricola, salario, dipartimento);
    }

    public double calculateSalary() {
        return super.getSalario() / 4;
    }

    @Override
    public String toString() {
        return "{" +
                " matricola='" + super.getMatricola() + "'" +
                ", salario='" + super.getSalario() + "'" +
                ", dipartimento='" + super.getDipartimento() + "'" +
                ", il dipendente è FullTime e ha un salario di " + calculateSalary()
                + " € settimanali di 40h a settimana."
                +
                "}";
    }
}
