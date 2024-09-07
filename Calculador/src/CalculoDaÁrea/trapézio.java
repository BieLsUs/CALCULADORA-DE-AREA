package CalculoDaÁrea;

import java.util.Scanner;

public class trapézio {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Obs: O calculo de trapézio e bem simples, pois a formula utilizada resulta no resultado de todos os tipos de trapézio.
        // Exceto se caso exista a precisão de um teorema de pitágoras, 
        // como o trapézio escaleno, trapézio isósceles e trapézio retângulo.

        System.out.println("Precisa utilizar o Teorema de Pitágoras?" + "\n" + "1.Sim" + "\n" + "2.Não" 
        + "\n" + "Obs: escolha um número valido!");
        int escolhaUsuario = terminal.nextInt();

        if (escolhaUsuario == 1) {
            System.out.println("(a² = b² + h²)");
            System.out.println("Insira o primeiro valor, da área");
            double area = terminal.nextDouble();
            area = Math.pow(area, 2);

            System.out.println("Insira o segundo valor, da base");
            double base = terminal.nextDouble();
            base = Math.pow(base, 2);

            double calculoAltura = area - base;

            System.out.printf("h=%.2f", + Math.sqrt(calculoAltura));
        } else if (escolhaUsuario >= 3) {
            String erro = "Valor ilegal! Utilize um valor correspondente.";
            IllegalArgumentException error = new IllegalArgumentException(erro);
            throw new IllegalArgumentException(error);
        }


        System.out.println("\n" + "Faça seu calculo de área de trapézio");

        System.out.println("Insira a Base maior:");
        double baseMaior = terminal.nextDouble();

        System.out.println("Insira a base menor:");
        double baseMenor = terminal.nextDouble();

        System.out.println("Insira a altura:");
        double altura = terminal.nextDouble();

        double area = (baseMaior + baseMenor) * altura/2;

        System.out.printf("A=%.1f", + area);
        terminal.close();
    }
}