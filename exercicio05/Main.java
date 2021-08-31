package exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorDaCompra;
        int quantidadeDePrestacoes;
        double valorDoDesconto;
        double valorDosJuros;
        double valorDoProdutoAVista;
        double valorDaPrestação;

        Scanner valor = new Scanner(System.in);
        System.out.println("digite o valor da compra: ");
        valorDaCompra = valor.nextDouble();
        System.out.println("digite a quantidade de prestações: ");
        quantidadeDePrestacoes = valor.nextInt();
        System.out.println("digite o valor do desconto a vista: ");
        valorDoDesconto = valor.nextInt();
        System.out.println("digite o valor dos juros: ");
        valorDosJuros = valor.nextInt();

        valorDoDesconto = (valorDaCompra * valorDoDesconto) / 100;

        valorDoProdutoAVista = valorDaCompra - valorDoDesconto;

        valorDosJuros = (valorDaCompra * valorDosJuros) / 100;

        valorDaPrestação = valorDaCompra / quantidadeDePrestacoes;

        valorDaPrestação += (valorDosJuros / quantidadeDePrestacoes);

        System.out.println("valor do produto: " + valorDoProdutoAVista);
        System.out.println("valor da prestacao com juros: " + valorDaPrestação);
        System.out.println("reais de juros pago em cada prestação: " + valorDosJuros / quantidadeDePrestacoes);

        valor.close();
    }
}
