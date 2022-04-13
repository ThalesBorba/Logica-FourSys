import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC >= 18.5 && IMC <= 25) {
            System.out.println("Você está dentro do intervalo");
        } else {
            System.out.println("Você não está dentro do intervalo");
        }
    }
}
