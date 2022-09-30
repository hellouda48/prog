import java.util.Scanner;
public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner la=new Scanner(System.in);
		int edad;
		int resp;
		do {
			
		
		System.out.println("Teclea tu edad");
		edad=la.nextInt();
		if(edad<=17){
			System.out.println("Eres menor de edad");
		}else{
			System.out.println("Eres mayor de edad");
		}
		System.out.println("Deseas volver a ejecutarlo(1=si/2=no)");
		resp=la.nextInt();
	} while (resp==1);
	}

}
