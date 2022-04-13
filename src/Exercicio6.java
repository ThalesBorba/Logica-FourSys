import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        System.out.println("O seu IMC é " + df.format(peso / (altura * altura)));
    }
}
