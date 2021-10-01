package Exercicios.questao2;

public class IngressoVip extends Ingresso {
    private double valorAdicional;

    public IngressoVip(double valor, double valorAdicional){

        super(valor);
        valorAdicional = this.valorAdicional;

    }

    public IngressoVip(double valor){

        super(valor);


    }



    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "O valor do IngressoVip é "+(getValor()+getValorAdicional());
    }
}
