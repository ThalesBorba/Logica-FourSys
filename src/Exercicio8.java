import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos refrigerantes de 350ml?");
        double lata = leitor.nextDouble() * 0.35;
        System.out.println("Quantos refrigerantes de 600ml?");
        double garrafaSeiscentos = leitor.nextDouble() * 0.6;
        System.out.println("Quantos refrigerantes de 2L?");
        double garrafaDoisLitros = leitor.nextDouble() * 2;

        double litros = lata + garrafaSeiscentos + garrafaDoisLitros;

        System.out.println("Você comprou " + df.format(litros) +
                " litros de refrigerante");
    }
}
