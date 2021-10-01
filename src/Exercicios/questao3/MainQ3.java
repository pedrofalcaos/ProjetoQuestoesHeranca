package Exercicios.questao3;

import java.util.Scanner;

public class MainQ3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empregado empregado = new Empregado();
        System.out.println("Digite o nome do empregado:");
        empregado.setNome(teclado.next());
        System.out.println("Digite o salário do empregado:");
        empregado.setSalario(teclado.nextDouble());
        System.out.println(empregado);
        Gerente gerente = new Gerente();
        System.out.println("Digite o nome do gerente:");
        gerente.setNome(teclado.next());
        System.out.println("Digite o salário do gerente:");
        gerente.setSalario(teclado.nextDouble());
        System.out.println("Digite o nome do departamento:");
        gerente.setDepartamento(teclado.next());
        System.out.println(gerente);
        Vendedor vendedor = new Vendedor();
        System.out.println("Digite o nome do vendedor:");
        vendedor.setNome(teclado.next());
        System.out.println("Digite o salário do vendedor:");
        vendedor.setSalario(teclado.nextDouble());
        System.out.println("Digite a porcentagem de comissão do vendedor:");
        vendedor.setValorComi(teclado.nextDouble());
        System.out.println(vendedor);


    }
}
