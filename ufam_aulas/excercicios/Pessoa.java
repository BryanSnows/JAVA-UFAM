import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade() {
        int idade = 2020 - this.anoNascimento;
        System.out.println("A idade atual de " + this.nome + " é: " + idade + " anos");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano de nascimento da pessoa:");
        int anoNascimento = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, anoNascimento);
        pessoa.calculaIdade();
    }
}