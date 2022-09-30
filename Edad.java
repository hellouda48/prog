package edad;
import java.util.*;
public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner la=new Scanner(System.in);
		int dia;
		int mes;
		int año;
		int dia2;
		int año2;
		año2=2022;
		int mes2;
		int edad;
		System.out.println("Teclea tu dia de cumpleaños");
		dia=la.nextInt();
		System.out.println("Teclea tu mes de cumpleaños");
		mes=la.nextInt();
		System.out.println("Teclea tu año de nacimientos");
		año=la.nextInt();
		System.out.println("Teclea el dia de hoy");
		dia2=la.nextInt();
		System.out.println("Teclea el mes en que estas");
		mes2=la.nextInt();
		if(mes<mes2){
			
				edad=año2-año;
				System.out.println("Tu edad es"+edad);
			}else{
				if(mes==mes2){
					if(dia<=dia2){
						edad=año2-año;
						System.out.println("Tu edad es"+edad);
					}else {
						año=año-1;
						edad=año2-año;
						System.out.println("Tu edad es"+edad);
					}
				}
			}if(mes>mes2) {
				año=año-1;
				edad=año2-año;
				System.out.println("Tu edad es"+edad);
			}
	}

}
