import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos itens foram vendidos? ");
        int itens = leitor.nextInt();

        System.out.print("O valor foi de ");
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                .format(itens * 1.99 * 0.95));

    }
}
