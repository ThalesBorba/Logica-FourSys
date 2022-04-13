import java.util.Objects;
import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um animal (gato, cachorro, papagaio, tubarão, macaco, leão ou serpente)");
        String animal = leitor.nextLine();

        System.out.print(animal + " em inglês é: ");

        switch (animal) {
            case "gato" -> System.out.println("cat");
            case "cachorro" -> System.out.println("dog");
            case "papagaio" -> System.out.println("parrot");
            case "tubarão" -> System.out.println("shark");
            case "macaco" -> System.out.println("monkey");
            case "leão" -> System.out.println("lion");
            case "serpente" -> System.out.println("snake");
        }
    }
}
