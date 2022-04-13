import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas moedas de 1 centavo?");
        double umCentavo = leitor.nextDouble() * 0.01;
        System.out.println("Quantas moedas de 5 centavos?");
        double cincoCentavos = leitor.nextDouble() * 0.05;
        System.out.println("Quantas moedas de 10 centavos?");
        double dezCentavos = leitor.nextDouble() * 0.10;
        System.out.println("Quantas moedas de 25 centavos?");
        double vinteECincoCentavos = leitor.nextDouble() * 0.25;
        System.out.println("Quantas moedas de 50 centavos?");
        double cinquentaCentavos = leitor.nextDouble() * 0.50;
        System.out.println("Quantas moedas de 1 real?");
        double umReal = leitor.nextDouble();

        double economias = umCentavo + cincoCentavos + dezCentavos +
                vinteECincoCentavos + cinquentaCentavos + umReal;

        System.out.println("Você economizou ");
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                .format(economias));
    }
}
