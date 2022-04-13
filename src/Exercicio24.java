import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 6");
        int diaDaSemana = leitor.nextInt();

        System.out.print("Você escolheu: ");

        switch (diaDaSemana) {
            case 0 -> System.out.println("Domingo");
            case 1 ->  System.out.println("Segunda");
            case 2 ->  System.out.println("Terça");
            case 3 ->  System.out.println("Quarta");
            case 4 ->  System.out.println("Quinta");
            case 5 ->  System.out.println("Sexta");
            case 6 ->  System.out.println("Sábado");
        }

    }
}
