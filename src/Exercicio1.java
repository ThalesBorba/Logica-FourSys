import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo: ");
        int altura = leitor.nextInt();
        System.out.println("Digite a base do retângulo: ");
        int base = leitor.nextInt();

        System.out.println("A área do retângulo é de " + altura * base);


    }
}
