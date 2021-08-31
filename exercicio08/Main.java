package exercicio08;

public class Main {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int divisores = 0;
        for (i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(" é par;");
            } else {
                System.out.print(" é ímpar;");
            }

            if (i % 3 == 0) {
                System.out.print(" é múltiplo de 3;");
            }
            if (i % 4 == 0) {
                System.out.print(" é múltiplo de 4;");
            }
            if (i % 5 == 0) {
                System.out.print(" é múltiplo de 5;");
                System.out.print(" numeros multiplos de 5 antes dele: ");
                for (j = i - 5; j >= 1; j--) {
                    if (j % 5 == 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.print(";");
            }

            for (k = i; k >= 1; k--) {
                if (i % k == 0) {
                    divisores++;
                }
            }
            if (divisores <= 2) {
                System.out.print(" é número primo;");
            } else {
                System.out.print(" não é número primo");
            }
            divisores = 0;
            System.out.println("\n\n");
        }
    }
}
