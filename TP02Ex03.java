//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
* 3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a *quantidade de
*números) será digitado, deverá ser positivo, porém menor que vinte. Caso a *quantidade não
*satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.Após *a digitação dos “N” valores, exibir:
*a. O maior valor;
*b. O menor valor;
*c. A soma dos valores;
*d. A média aritmética dos valores;
*e. A porcentagem de valores que são positivos;
*f. A porcentagem de valores negativos;
*Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
*programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar *o
*programa em função dessa resposta.
 */

import java.util.Scanner;

public class TP02Ex03{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char resposta;

        do {
            // Ler a quantidade de números
            int n = 0;
            while (n <= 0 || n >= 20) {
                System.out.print("Digite a quantidade de números (entre 1 e 19): ");
                n = input.nextInt();

                if (n <= 0 || n >= 20) {
                    System.out.println("Valor inválido. Tente novamente.");
                }
            }

            // Ler os valores
            double maiorValor = Double.MIN_VALUE;
            double menorValor = Double.MAX_VALUE;
            double soma = 0;
            int qtdPositivos = 0;
            int qtdNegativos = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o " + i + "º valor: ");
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

            // Calcular a média
            double media = soma / n;

            // Exibir os resultados
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Porcentagem de valores positivos: " + (qtdPositivos * 100.0 / n) + "%");
            System.out.println("Porcentagem de valores negativos: " + (qtdNegativos * 100.0 / n) + "%");

            // Perguntar se deseja executar o programa novamente
            System.out.print("Deseja executar o programa novamente? (S/N) ");
            resposta = input.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Programa encerrado.");
    }
}