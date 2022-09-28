import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		int n3;
		Scanner la=new Scanner(System.in);
		System.out.println("Teclea el numero 1");
		n1=la.nextInt();
		System.out.println("Teclea el numero 2");
		n2=la.nextInt();
		System.out.println("Teclea el numero 3");
		n3=la.nextInt();
		if((n1>n2)&&(n1>n3)){
			System.out.println("El numero 1 es el mayor");
		}else{
			if((n2>n1)&&(n2>n3)){
			System.out.println("El numero 2 es el mayor");
		}else{
			if((n3>n2)&&(n3>n1)){
			System.out.println("El numero 3 es el mayor");}
		};
		
	}

}
}
