import java.util.Scanner;

public class Eleitor {
    private int idade;
    
    public Eleitor(int idade) {
        this.idade = idade;
    }
    
    public void calculeClasseEleitoral() {
        if (idade < 16) {
            System.out.println("nao votante");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("eleitor obrigatorio");
        } else {
            System.out.println("eleitor facultativo");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do eleitor: ");
        int idade = scanner.nextInt();
        
        Eleitor eleitor = new Eleitor(idade);
        eleitor.calculeClasseEleitoral();
    }
}


