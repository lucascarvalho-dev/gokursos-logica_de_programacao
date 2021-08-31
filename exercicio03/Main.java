package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float raio;
        final double PI = 3.14;
        float diametro;
        double perimetro;
        double area;

        System.out.println("Digite o valor do RAIO de um círculo: ");
        raio = leia.nextFloat();
        diametro = raio * 2;
        perimetro = (2 * PI) * diametro;
        area = PI * (raio * raio);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        leia.close();
    }
}
