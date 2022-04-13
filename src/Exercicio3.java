import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = leitor.nextInt();

        System.out.println("A soma dos valores é " + (a + b));
    }
}
