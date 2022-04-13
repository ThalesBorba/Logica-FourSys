import java.util.Objects;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um animal (gato, cachorro, papagaio, tubarão, macaco, leão ou serpente");
        String animal = leitor.nextLine();

        System.out.print(animal + " em inglês é: ");

        if (Objects.equals(animal, "gato")) {
            System.out.println("cat");
        } else if (Objects.equals(animal, "cachorro")) {
            System.out.println("dog");
        } else if (Objects.equals(animal, "papagaio")) {
            System.out.println("parrot");
        } else if (Objects.equals(animal, "tubarão")) {
            System.out.println("shark");
        } else if (Objects.equals(animal, "macaco")) {
            System.out.println("monkey");
        } else if (Objects.equals(animal, "leão")) {
            System.out.println("lion");
        } else if (Objects.equals(animal, "serpente")) {
            System.out.println("snake");
        }
    }
}
