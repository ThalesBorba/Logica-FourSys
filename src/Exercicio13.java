import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = leitor.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = leitor.nextInt();

        System.out.print("A média dos valores é " + ((a + b + c)/3) +
                ", e a soma dos dois primeiros valores");
        if (a + b <= c) {
            System.out.print(" não");
        }
        System.out.println(" é maior que o terceiro");
    }
}
