import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        boolean validacao = true;

        do {
            System.out.println("Digite dois números");
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            System.out.println(a + b);
            System.out.println("Deseja continuar? S/N");
            String continuar = leitor.next();
            if (continuar.equalsIgnoreCase("n")) {
                validacao = false;
            }

        } while (validacao);
    }
}