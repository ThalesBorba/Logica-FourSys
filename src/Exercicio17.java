import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = leitor.nextLine();
        System.out.println("Digite seu rg: ");
        String rg = leitor.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = leitor.nextLine();

        if (nome.isBlank() || email.isBlank() || rg.isBlank() || cpf.isBlank()) {
            System.out.println("Há campos não preenchidos!");
        } else {
            System.out.println("Todos os campos foram preenchidos!");
        }
    }
}
