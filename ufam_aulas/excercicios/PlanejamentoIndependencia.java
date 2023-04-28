import java.util.Scanner;

public class PlanejamentoIndependencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor que você ganha por hora: ");
        float valorHora = scanner.nextFloat();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        
        float salario = valorHora * horasTrabalhadas;
        System.out.printf("Seu salário este mês será de R$%.2f", salario);
    }
}