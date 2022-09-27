import java.util.Scanner;

public class costo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costo;
		double iva;
		double total;
		Scanner Lae=new Scanner(System.in);
		System.out.println("Teclea el costo del producto");
		costo=Lae.nextInt();
		iva=costo*0.16;
		total=costo+iva;
		System.out.println("El iva aplicado es:"+ iva);
		System.out.println("El total es:"+ total);
		
		
	}

}
