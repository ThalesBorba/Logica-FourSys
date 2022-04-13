import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10: ");
        int numero = leitor.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " X " + numero + " = " + (numero * i));
        }
    }


}
