import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean validacao = true;

        do {
            System.out.println("Digite seu nome: ");
            String nome = leitor.nextLine();
            if (!nome.isBlank()) {
                validacao = false;
            }
        } while (validacao);
    }
}
