import java.util.*;
public class Incremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int n=0, n1=0, acum=0;
		System.out.println("Teclea de cuanto quieres el imncremento");
		n=leer.nextInt();
		System.out.println("Teclea hasta que numero quieres que sea el limite");
		n1=leer.nextInt();
		do {
			System.out.println(acum);
			acum+=n;
		}while(acum<=n1);
	}

}
