import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Qual é o seu sexo? Digite M/F: ");
        String sexo = leitor.next();
        System.out.println("Qual é a sua altura? ");
        Double altura = leitor.nextDouble();

        System.out.println("Seu peso ideal é ");
        if (sexo.equalsIgnoreCase("m")) {
            System.out.print(df.format((72.7 * altura) - 58));
        } else {
            System.out.print(df.format((62.1 * altura) - 44.7));
        }
        System.out.println("kg");
    }
}
