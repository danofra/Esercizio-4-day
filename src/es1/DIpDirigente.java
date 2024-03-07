package es1;

public class DIpDirigente extends Dipendente {

    public DIpDirigente(int matricola, double salario, Dipartimento dipartimento) {
        super(matricola, salario, dipartimento);
    }

    public double calculateSalary() {
        return super.getSalario();
    }

    @Override
    public String toString() {
        return "{" +
                " matricola='" + super.getMatricola() + "'" +
                ", salario='" + super.getSalario() + "'" +
                ", dipartimento='" + super.getDipartimento() + "'" +
                ", il dipendente è un Dirigente e ha un salario di " + calculateSalary() + " € mensili."
                +
                "}";
    }
}
