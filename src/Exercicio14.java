import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        int valor = leitor.nextInt();
        System.out.println("Compra a vista? Digite S ou N");
        String forma = leitor.next();

        System.out.print("O valor da compra ficou em ");
        if (forma.equalsIgnoreCase("s")) {
            System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                    .format(valor * 0.9));
        } else {
            System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                    .format(valor * 0.95));
        }
    }
}
