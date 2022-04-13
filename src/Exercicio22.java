import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        int valor = leitor.nextInt();
        System.out.println("Condições de pagamento: \nDigite 1 para dinheiro ou cheque" +
                " \nDigite 2 para cartão de crédito \nDigite 3 para parcelar em 2 vezes" +
                " \nDigite 4 para parcelar em 6 vezes");
        int formaDePagamento = leitor.nextInt();

        System.out.print("O valor de sua compra ficou em ");
        if (formaDePagamento == 1) {
            System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                    .format(valor * 0.85));
        } else if (formaDePagamento == 2) {
            System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                    .format(valor * 0.95));
        } else if (formaDePagamento == 3) {
            System.out.println("duas vezes de " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                    .format(valor/2));
        } else if (formaDePagamento == 4) {
            System.out.println("seis vezes de " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                    .format((valor * 1.1) / 6));
        }
    }
}
