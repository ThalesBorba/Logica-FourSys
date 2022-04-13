import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        for (int i = numero; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

    }
}
