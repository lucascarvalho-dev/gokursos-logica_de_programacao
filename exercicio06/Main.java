package exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerInt = new Scanner(System.in);
        Scanner lerDouble = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);

        int idade;
        final int maiorDeIdade = 18;
        System.out.println("digite sua idade: ");
        idade = lerInt.nextInt();
        System.out.println("maior de idade: " + (idade >= maiorDeIdade));

        double salario;
        final double salarioMinimo = 1100.00;
        System.out.println("digite seu salario: ");
        salario = lerDouble.nextDouble();
        System.out.println("voce ganha mais que um salario minimo: " + (salario > salarioMinimo));

        double altura;
        final double alturaPadrao = 1.8;
        System.out.println("digite sua altura: ");
        altura = lerDouble.nextDouble();
        System.out.println("sua altura é maior que 1.80m: " + (altura > alturaPadrao));

        double peso;
        final double pesoPadrao = 60;
        System.out.println("digite seu peso: ");
        peso = lerDouble.nextDouble();
        System.out.println("seu peso é menor que 60kg: " + (peso < pesoPadrao));

        String nome;
        final String nomePadrao = "Lucas";
        System.out.println("digite seu nome: ");
        nome = lerString.nextLine();
        System.out.println("seu nome: " + nome + " é igual a " + nomePadrao + ": " + (nome.equals(nomePadrao)));

        lerInt.close();
        lerDouble.close();
        lerString.close();
    }
}
