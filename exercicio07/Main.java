package exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerString = new Scanner(System.in);
        Scanner lerInt = new Scanner(System.in);
        Scanner lerDouble = new Scanner(System.in);

        String nomePadrao = new String();
        nomePadrao = "Lucas";
        final int idadePadrao = 19;
        final double pesoPadrao = 58;
        final double alturaPadrao = 1.71;
        String seriePadrao = new String();
        seriePadrao = "Loki";
        String musicaPadrao = new String();
        musicaPadrao = "Phenomena";
        String jogoPadrao = new String();
        jogoPadrao = "Among Us";

        String nome = new String();
        int idade;
        double peso;
        double altura;
        String serie = new String();
        String musica = new String();
        String jogo = new String();
        int caracteristicasIguais = 0;

        System.out.println("Digite seu nome: ");
        nome = lerString.nextLine();
        System.out.println("Digite sua idade: ");
        idade = lerInt.nextInt();
        System.out.println("Digite seu peso: ");
        peso = lerDouble.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = lerDouble.nextDouble();
        System.out.println("Digite sua serie favorita: ");
        serie = lerString.nextLine();
        System.out.println("Digite sua musica favorita: ");
        musica = lerString.nextLine();
        System.out.println("Digite seu jogo favorito: ");
        jogo = lerString.nextLine();

        if (nome.equals(nomePadrao)) {
            System.out.println("Pessoa com nome igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com o nome diferente");
        }

        if (idade == idadePadrao) {
            System.out.println("Pessoa com idade igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com idade diferente");
        }

        if (peso == pesoPadrao) {
            System.out.println("Pessoa com peso igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com peso diferente");
        }

        if (altura == alturaPadrao) {
            System.out.println("Pessoa com altura igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com altura diferente");
        }

        if (serie.equals(seriePadrao)) {
            System.out.println("Pessoa com serie favorita igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com serie favorita diferente");
        }

        if (musica.equals(musicaPadrao)) {
            System.out.println("Pessoa com musica favorita igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com musica diferente igual");
        }

        if (jogo.equals(jogoPadrao)) {
            System.out.println("Pessoa com jogo favorito igual");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com jogo favorito diferente");
        }

        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa não é nada parecida comigo!");
        }

        lerString.close();
        lerDouble.close();
        lerInt.close();
    }
}
