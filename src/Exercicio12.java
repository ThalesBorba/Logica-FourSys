import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = leitor.nextInt();

        System.out.print("A soma dos valores é " + (a + b) + " e o maior valor é ");
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
