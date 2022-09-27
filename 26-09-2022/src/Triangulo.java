import java.util.*;
public class Triangulo {

	public static void main(String[] args) {
		//variables
		int base,altura;
		double area;
		//objeto para la lectura
		Scanner Lae=new Scanner(System.in);
		/*Scanner es la clase, L es el objeto, new es el operador para crear objetos
		 * Scanner(System.in) es la llamada al etodo que construye el objeto(Metodo constructor)
		 */
		System.out.println("Teclea la base del triangulo");
		base=Lae.nextInt();
		System.out.println("Teclea la altura");
		altura=Lae.nextInt();
		area=(base*altura)/2;
		System.out.println("El area es:" + area);
	}

}
