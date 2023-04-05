//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
 * 2. Entrar via teclado com dez valores positivos. Consistir a digita��o e enviar mensagem de erro, se necess�rio. Ap�s *a digita��o, exibir:
*a. O maior valor;
*b. A soma dos valores;
*c. A m�dia aritm�tica dos valores.
 */

import java.util.Scanner;


public class TP02Ex02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maiorValor = Double.MIN_VALUE;
        double somaValores = 0;
        double mediaAritmetica = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = input.nextDouble();

            while (valor <= 0) {
                System.out.println("Valor inv�lido! O valor deve ser positivo.");
                System.out.print("Digite o valor " + i + " novamente: ");
                valor = input.nextDouble();
            }

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            somaValores += valor;
        }

        mediaAritmetica = somaValores / 10;

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("A soma dos valores digitados foi: " + somaValores);
        System.out.println("A m�dia aritm�tica dos valores digitados foi: " + mediaAritmetica);
    }
}

