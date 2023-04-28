public class Tartaruga {
    private double tamanhoAtual; // em mm
    private double taxaCrescimento; // em mm/ano
    
    public Tartaruga(double tamanhoAtual, double taxaCrescimento) {
        this.tamanhoAtual = tamanhoAtual;
        this.taxaCrescimento = taxaCrescimento;
    }
    
    public double getTamanhoAtual() {
        return tamanhoAtual;
    }
    
    public double getTaxaCrescimento() {
        return taxaCrescimento;
    }
    
    public double tempoAteIgualdade(Tartaruga outraTartaruga) {
        double tamanhoOutra = outraTartaruga.getTamanhoAtual();
        double taxaOutra = outraTartaruga.getTaxaCrescimento();
        double tempo = 0;
        
        while (this.tamanhoAtual < tamanhoOutra) {
            this.tamanhoAtual += this.taxaCrescimento;
            tamanhoOutra += taxaOutra;
            tempo++;
        }
        
        return tempo;
    }
    
    public static void main(String[] args) {
        // Recebendo os dados de entrada
        double ta1 = Double.parseDouble(args[0]);
        double tc1 = Double.parseDouble(args[1]);
        double ta2 = Double.parseDouble(args[2]);
        double tc2 = Double.parseDouble(args[3]);
        
        // Criando as tartarugas com os dados de entrada
        Tartaruga tartaruga1 = new Tartaruga(ta1, tc1);
        Tartaruga tartaruga2 = new Tartaruga(ta2, tc2);
        
        // Calculando o tempo até as tartarugas alcançarem o mesmo tamanho
        double tempo = tartaruga1.tempoAteIgualdade(tartaruga2);
        
        // Imprimindo o resultado
        System.out.print(tempo);
    }
}