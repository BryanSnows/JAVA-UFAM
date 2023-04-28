import java.util.Scanner;

public class Temperatura {
    private float farenheit;

    public Temperatura(float farenheit) {
        this.farenheit = farenheit;
    }

    public float getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(float farenheit) {
        this.farenheit = farenheit;
    }

    public void converteCelsius() {
        float celsius = (farenheit - 32) * 5 / 9;
        System.out.println("A temperatura em F: " + farenheit );
        System.out.println("temperatura em C: " + celsius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Farenheit: ");
        float farenheit = input.nextFloat();

        Temperatura temp = new Temperatura(farenheit);
        temp.converteCelsius();
    }
}