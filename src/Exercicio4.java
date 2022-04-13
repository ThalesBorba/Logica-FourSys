import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = leitor.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = leitor.nextInt();

        System.out.println("A média dos valores é " + ((a + b + c)/3));
    }
}
