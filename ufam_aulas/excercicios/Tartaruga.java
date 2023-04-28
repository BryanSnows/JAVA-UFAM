import java.util.Scanner;

public class Tartaruga {
    private double tamanhoAtual;
    private double taxaCrescimento;

    public Tartaruga(double tamanhoAtual, double taxaCrescimento) {
        this.tamanhoAtual = tamanhoAtual;
        this.taxaCrescimento = taxaCrescimento;
    }

    public double getTamanhoAtual() {
        return tamanhoAtual;
    }

    public void setTamanhoAtual(double tamanhoAtual) {
        this.tamanhoAtual = tamanhoAtual;
    }

    public double getTaxaCrescimento() {
        return taxaCrescimento;
    }

    public void setTaxaCrescimento(double taxaCrescimento) {
        this.taxaCrescimento = taxaCrescimento;
    }

    public double tempoParaIgualdade(Tartaruga outra) {
        double difTamanhos = Math.abs(this.tamanhoAtual - outra.tamanhoAtual);
        double difTaxas = Math.abs(this.taxaCrescimento - outra.taxaCrescimento);
        return difTamanhos / difTaxas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ta1 = sc.nextDouble();
        double tc1 = sc.nextDouble();
        double ta2 = sc.nextDouble();
        double tc2 = sc.nextDouble();

        Tartaruga t1 = new Tartaruga(ta1, tc1);
        Tartaruga t2 = new Tartaruga(ta2, tc2);

        double tempo = t1.tempoParaIgualdade(t2);
        System.out.printf("%.2f\n", tempo);
        sc.close();
    }
}