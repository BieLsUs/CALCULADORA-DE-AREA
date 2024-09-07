package CalculoDaÁrea;


import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		
		//Introduzindo variáveis
		System.out.println("Qual será o valor de PI? 1.(3,14) ou 2.(3)?");
        double n = terminal.nextDouble();
        
        if(n == 1) {
        	n = 3.14;
        	System.out.println("PI = 3,14");
        }else if (n == 2) {
        	n = 3;
        	System.out.println("PI = 3");
        }else {
        	System.out.println("Insira o número valido! Operação encerrada.");
        	System.exit(0);
        }
        
        System.out.println("Insira o valor do Raio: ");
        double raio = terminal.nextDouble();
        
        //Multiplicando o raio ao quadrado
        raio = Math.pow(raio, 2);
        
        //Efetuando a multiplicação da area
        double area = n * raio;
        
        System.out.printf("A=%.2f", + area);
        terminal.close();
	}
}