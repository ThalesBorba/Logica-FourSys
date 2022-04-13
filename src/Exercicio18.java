import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Digite seu peso: ");
            double peso = leitor.nextDouble();
            System.out.println("Digite sua altura: ");
            double altura = leitor.nextDouble();

            double imc = peso / (altura * altura);

        System.out.println(imc);

            System.out.println("Sua condição é: ");
            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24.9) {
                System.out.println("Peso normal");
            } else if (imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc < 34.9) {
                System.out.println("Obesidade Grau I");
            } else if (imc < 39.9) {
                System.out.println("Obesidade Grau II");
            } else {
                System.out.println("Obesidade Grau III ou Mórbida");
            }
        }
    }

