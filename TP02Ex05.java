//NOMES; LUCAS AQUINO, DOUGLAS REIS
//5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.


public class TP02Ex05{
public static void main(String[]args){
	// Criando a matriz e atribuindo valores
 		int[][] matriz = {{2, 5}, {0, 6}, {200, 02}};

	// Exibindo os valores na tela
	for (int i = 0; i < 3; i++) {
    	for (int j = 0; j < 2; j++) {
        System.out.print(matriz[i][j] + " | ");
    			}
    	System.out.println(); // Quebra de linha após cada linha da matriz
		}


	}
}