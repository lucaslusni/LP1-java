//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
 * 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.Caso contrário solicitar novamente apenas o segundo valor.
 */
import java.util.Scanner;

public class TP02Ex01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
	
        double primeiroNumero, segundoNumero;

        System.out.print("Digite o primeiro valor: ");
        primeiroNumero = scan.nextDouble();
	
        System.out.print("Digite o segundo valor (deve ser maior que o primeiro): ");
        segundoNumero = scan.nextDouble();

        while (segundoNumero <= primeiroNumero) {
            System.out.println("O segundo valor deve ser maior que o primeiro!");
            System.out.print("Digite o segundo valor novamente: ");
            segundoNumero = scan.nextDouble();
        }

        System.out.println("Os valores digitados foram: " + primeiroNumero + " e " + segundoNumero);
    }
}
