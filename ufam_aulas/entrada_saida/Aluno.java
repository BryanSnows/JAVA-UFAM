import java.util.Scanner;

import java.util.Scanner;
public class Aluno {
    public void someDoisNumeros() {
        Scanner ler = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("forneca dis numeros:");
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        System.out.println("Os dois números lidos foram");
        System.out.println(num1);
        System.out.println(num2);
        num3 = num1 + num2;
        System.out.println("O resultado da soma foi: ");
        System.out.println(num3);
    }
}
