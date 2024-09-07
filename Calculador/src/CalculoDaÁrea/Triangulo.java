package CalculoDaÁrea;


import java.util.Scanner;

public class Triangulo {
  @SuppressWarnings("resource")

public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Obs: A cauculadora de área do triângulo realiza o calculo de triângulo Retângulo sem precisar escolher uma opção;
        System.out.println("Precisa de algum desses calculos de trinagulos para realizar o calculo da área?");
        System.out.println("1.triângulo isósceles" + "\n" + "2.Não");
        int escolhaCalculo = terminal.nextInt();


            if (escolhaCalculo == 1 ) {
            System.out.println("Para realizar o calculo do triângulo isósceles precisaremos primeiro fazer o calculo da altura" 
            + "\n" + "utilizando o teorema de Pitágoras, para depois rializarmos o calculo da área." 
            + "\n" + "O calculo do teorema de Pitágoras é (a² = b² + c²), que ficará (Área² = Base² + Altura²");
            
            System.out.println("insira o valor da área:");
            double area = terminal.nextDouble();
            area = Math.pow(area, 2);

            System.out.println("insira o valor da base:");
            double base = terminal.nextDouble();
            base = Math.pow(base, 2);
            
            double calculoAltura = area - base;

            System.out.printf("h=%.2f", + Math.sqrt(calculoAltura));

            } else if (escolhaCalculo >= 3) {
                String erro = "ERRO! Escolha entre os números 1 e 2";
                IllegalArgumentException error = new IllegalArgumentException(erro);
                throw new IllegalArgumentException(error);
            }

        // Precisamos itroduzir variáveis como Base e Altura; e no final realizar o calculo da Área.
        // Obs: o calculo da base e altura dividido por 2;
        System.out.println("\n" + "Faça seu calculo da área do triângulo!" + "\n" + "Insira a base:");
        double base = terminal.nextDouble();

        System.out.println("Insira a altura:");
        double altura = terminal.nextDouble();

        double area = base * altura /2;

        System.out.printf("A=%.1f", + area);

        terminal.close();
    }
}