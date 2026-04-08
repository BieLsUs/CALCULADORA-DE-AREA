import java.util.Scanner;

public class porcentagem {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("| Calculo de porcentagem | \n");

        System.out.println("Insira a porcentagem a ser descontado: ");
        double valorPorcent = terminal.nextDouble();

        double porcentagem = valorPorcent / 100;

        System.out.println("Insira o valor do produto: ");
        double valorProduto = terminal.nextDouble();


        double resultado = valorProduto * porcentagem;

        System.out.println("Desconto de: " + resultado);
        terminal.close();
    }
}
