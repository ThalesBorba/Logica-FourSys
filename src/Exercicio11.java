import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        double CUSTO_POR_CAVALO = 4 * 9.9;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos cavalos precisam de ferradura?");
        double valorFinal = leitor.nextDouble() * CUSTO_POR_CAVALO;

        if (valorFinal > 100) {
            valorFinal *= 0.9;
        }

        System.out.print("O custo foi de ");
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                .format(valorFinal));
    }
}
