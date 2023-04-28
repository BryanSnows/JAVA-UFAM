import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\nDados pessoais:");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.printf("Média: %.2f\n", media);
    }
}