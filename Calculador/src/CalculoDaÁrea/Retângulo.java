package CalculoDaÁrea;

import java.util.Scanner;

public class Retângulo {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Deseja qual calculo do retângulo?" + "\n" + "1.Perímetro do retângulo" + "\n" + "2.Diagonal do retângulo" + "\n" + "3.Área do retângulo");
        int escolhaUsuario = terminal.nextInt();

        if (escolhaUsuario == 1) {
            System.out.println("Calculo do Perímetro do Retângulo --> P=2(b+h)" + "\n");

            System.out.println("Insira a base:");
            double base = terminal.nextDouble();
            System.out.println("Insira a altura:");
            double altura = terminal.nextDouble();

            double perimetro = 2*(base + altura);

            System.out.printf("P=%.1f", + perimetro);
            System.exit(0);;
            
        }else if ( escolhaUsuario == 2) {
            System.out.println("Calculo da Diagonal do Retângulo --> d²=h²+b²" + "\n");

            System.out.println("Insira a altura:");
            double altura = terminal.nextDouble();
            altura = Math.pow(altura, 2);

            System.out.println("Insira a base:");
            double base = terminal.nextDouble();
            base = Math.pow(base, 2);

            double diagonal = altura + base;

            System.out.printf("d=%.1f", + Math.sqrt(diagonal));
            System.exit(0);
        }
        else if (escolhaUsuario >= 4) {
            String aviso = "Escolha um número entre 1, 2 e 3!";
            String error = "Erro de argumento ilegal.";
            IllegalArgumentException erro = new IllegalArgumentException(error);
            throw new IllegalArgumentException(aviso, erro);
        }

        System.out.println("Insira o valor da base:");
        double base = terminal.nextDouble();

        System.out.println("Insira o valor da altura:");
        double altura = terminal.nextDouble();

        double area = base * altura;

        System.out.printf("A=%.1f", + area);
        terminal.close();
    }
    
}