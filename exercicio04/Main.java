package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double aresta;
        double area;
        double volume;
        double diagonal;
        final double raizDe3 = 1.73;

        System.out.println("Digite o valor da Aresta: ");
        aresta = valor.nextDouble();
        area = aresta * aresta;
        volume = area * aresta;
        diagonal = aresta * raizDe3;

        System.out.println("Area da Superficie: " + area);
        System.out.println("Volume: " + volume);
        System.out.println("Diagonal: " + diagonal);
        valor.close();
    }
}
