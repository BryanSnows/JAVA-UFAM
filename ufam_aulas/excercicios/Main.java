import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.next();
        int pontos1 = sc.nextInt();
        String nome2 = sc.next();
        int pontos2 = sc.nextInt();

        Competidor c1 = new Competidor(nome1, pontos1);
        Competidor c2 = new Competidor(nome2, pontos2);

        sc.close();

        c1.ComparaCompetidorCom(c2); // Imprime o nome do competidor com mais pontos
    }
}

class Competidor {
    private String nome;
    private int pontos;

    public Competidor(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void ComparaCompetidorCom(Competidor outroCompetidor) {
        if (this.pontos > outroCompetidor.getPontos()) {
            System.out.println(this.nome + " tem mais pontos que " + outroCompetidor.getNome());
        } else {
            System.out.println(outroCompetidor.getNome() + " tem mais pontos que " + this.nome);
        }
    }
}