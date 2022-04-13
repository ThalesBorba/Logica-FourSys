import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        for (int i = 0; i < 15; i++) {
            System.out.println(nome);
        }
    }
}
