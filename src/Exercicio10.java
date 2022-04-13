import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo: ");
        int altura = leitor.nextInt();
        System.out.println("Digite a base do retângulo: ");
        int base = leitor.nextInt();

        System.out.print("A área do retângulo é de " + altura * base);
        if (altura == base) {
            System.out.println(", e este é um quadrado");
        } else {
            System.out.println(", e este não é um quadrado");
        }
    }
}
