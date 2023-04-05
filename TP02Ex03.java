//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
* 3. Entrar via teclado com �N� valores quaisquer. O valor �N� (que representa a *quantidade de
*n�meros) ser� digitado, dever� ser positivo, por�m menor que vinte. Caso a *quantidade n�o
*satisfa�a a restri��o, enviar mensagem de erro e solicitar o valor novamente.Ap�s *a digita��o dos �N� valores, exibir:
*a. O maior valor;
*b. O menor valor;
*c. A soma dos valores;
*d. A m�dia aritm�tica dos valores;
*e. A porcentagem de valores que s�o positivos;
*f. A porcentagem de valores negativos;
*Ap�s exibir os dados, perguntar ao usu�rio de deseja ou n�o uma nova execu��o do
*programa. Consistir a resposta no sentido de aceitar somente �S� ou �N� e encerrar *o
*programa em fun��o dessa resposta.
 */

import java.util.Scanner;

public class TP02Ex03{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char resposta;

        do {
            // Ler a quantidade de n�meros
            int n = 0;
            while (n <= 0 || n >= 20) {
                System.out.print("Digite a quantidade de n�meros (entre 1 e 19): ");
                n = input.nextInt();

                if (n <= 0 || n >= 20) {
                    System.out.println("Valor inv�lido. Tente novamente.");
                }
            }

            // Ler os valores
            double maiorValor = Double.MIN_VALUE;
            double menorValor = Double.MAX_VALUE;
            double soma = 0;
            int qtdPositivos = 0;
            int qtdNegativos = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o " + i + "� valor: ");
                double valor = input.nextDouble();

                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                if (valor < menorValor) {
                    menorValor = valor;
                }

                soma += valor;

                if (valor > 0) {
                    qtdPositivos++;
                } else if (valor < 0) {
                    qtdNegativos++;
                }
            }

            // Calcular a m�dia
            double media = soma / n;

            // Exibir os resultados
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Soma: " + soma);
            System.out.println("M�dia: " + media);
            System.out.println("Porcentagem de valores positivos: " + (qtdPositivos * 100.0 / n) + "%");
            System.out.println("Porcentagem de valores negativos: " + (qtdNegativos * 100.0 / n) + "%");

            // Perguntar se deseja executar o programa novamente
            System.out.print("Deseja executar o programa novamente? (S/N) ");
            resposta = input.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Programa encerrado.");
    }
}