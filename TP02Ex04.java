//NOMES; LUCAS AQUINO, DOUGLAS REIS
//4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.

public class TP02Ex04{
    	public static void main(String[] args) {
	// criando a matriz 
	int[][] matriz = new int[2][3];
	
	// atribuindo valores à matriz
	matriz[0][0] = 6;
	matriz[0][1] = 5;
	matriz[0][2] = 4;
	matriz[1][0] = 3;
	matriz[1][1] = 2;
	matriz[1][2] = 1;

	// exibindo os valores na tela
	for (int i = 0; i < 2; i++) {
    	for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " | ");
    			}
	System.out.println();
		}
		
	}
}