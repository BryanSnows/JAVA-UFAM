public class MultaVelocidade {
    private int velocidadeMaxima;
    private int velocidadeMotorista;

    public MultaVelocidade(int velocidadeMaxima, int velocidadeMotorista) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMotorista = velocidadeMotorista;
    }

    public void calcularMulta() {
        int diferenca = this.velocidadeMotorista - this.velocidadeMaxima;

        if (diferenca > 0 && diferenca <= 10) {
            System.out.println(50);
        } else if (diferenca > 10 && diferenca <= 30) {
            System.out.println(100);
        } else if (diferenca > 30) {
            System.out.println(200);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        MultaVelocidade multa1 = new MultaVelocidade(60, 61);
        multa1.calcularMulta(); // Saída: Multa de 50 reais
    
        MultaVelocidade multa2 = new MultaVelocidade(60, 83);
        multa2.calcularMulta(); // Saída: Multa de 200 reais
    
        MultaVelocidade multa3 = new MultaVelocidade(60, 91);
        multa3.calcularMulta(); // Saída: Sem multa
    }
}
