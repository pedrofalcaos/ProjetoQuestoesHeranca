package Exercicios.questao3;

public class Gerente extends Empregado {

    private String departamento;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public Gerente() {
        super();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "O nome do gerente é "+getNome()+" o salário é"+getSalario()+" e o departamento é "+getDepartamento();
    }
}
