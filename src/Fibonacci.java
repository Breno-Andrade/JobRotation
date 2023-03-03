import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c;
        boolean pertence = false;

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            while (b < numero) {
                c = a + b;
                a = b;
                b = c;
                if (b == numero) {
                    pertence = true;
                    break;
                }
            }
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
