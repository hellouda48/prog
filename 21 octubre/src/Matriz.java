import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int matriz [][] = new int [4] [4];
			for(int i = 0; i<4; i++ ){
				for (int j=0; j<4; i++){
					System.out.println("Ingrese un valor para"+i+j);
					matriz[i][j] = leer.nextInt();
					
				}
			}
			for(int i=0; i< matriz.length; i++){
				for(int j=0; j<matriz.length; j++){
					System.out.print(matriz[i][j]);
					
				}
				System.out.println("");
			}
		}
	}

