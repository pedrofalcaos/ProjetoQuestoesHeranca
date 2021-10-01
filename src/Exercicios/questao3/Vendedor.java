package Exercicios.questao3;

public class Vendedor extends Empregado{

    private double valorComi;

    public double getValorComi() {
        return valorComi;
    }

    public void setValorComi(double valorComi) {
        this.valorComi = valorComi;
    }

    public Vendedor(String nome, double salario){
        super(nome, salario);
    }
    public Vendedor(){
        super();
    }
    private double calcuaSalario(){
        return (getSalario()+(getSalario()*(getValorComi()/100)));

    }

    @Override
    public String toString() {
        return "O nome do vendedor é "+getNome()+"O salario dele é   "+calcuaSalario();
    }
}
