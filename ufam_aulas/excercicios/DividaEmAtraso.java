import java.util.Scanner;

public class DividaEmAtraso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor original da dívida: ");
        float valorOriginal = input.nextFloat();

        System.out.print("Digite a quantidade de dias em atraso: ");
        int diasAtraso = input.nextInt();

        System.out.print("Digite o valor da multa diária: ");
        float multaDiaria = input.nextFloat();

        float valorMulta = multaDiaria  * diasAtraso;
        float valorAtual = valorOriginal + valorMulta;

        System.out.printf("O valor da sua dívida atual eh: %.2f", valorAtual);
    }
}