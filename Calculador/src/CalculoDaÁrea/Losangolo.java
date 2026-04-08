package CalculoDaÁrea;

import java.util.Scanner;

public class Losangolo {
    
    public static void main(String args[]) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("| Calculo da área do losango | \n");

        System.out.println("Insira o valor da diagonal maior: ");
        double Dmaior = terminal.nextDouble();

        System.out.println("Insira o valor da diagonal menor: ");
        double Dmenor = terminal.nextDouble();

        double area = (Dmaior * Dmenor)/2;

        System.out.println("A = " + area);
        terminal.close();
    }
}
