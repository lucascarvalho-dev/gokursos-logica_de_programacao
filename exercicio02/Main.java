package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        System.out.println("Sua idade é " + idade);
        leia.close();
    }
}
