import java.util.Scanner;

public class Numero {
    private int valor;
    
    public Numero(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void antecessorSucessor() {
        int antecessor = valor - 1;
        int sucessor = valor + 1;
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int valor = scanner.nextInt();
        Numero numero = new Numero(valor);
        numero.antecessorSucessor();
    }
}