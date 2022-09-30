import java.util.*;
public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner la=new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		int dia2;
		int ano2;
		ano2=2022;
		int mes2;
		int edad;
		System.out.println("Teclea tu dia de cumpleanos");
		dia=la.nextInt();
		System.out.println("Teclea tu mes de cumpleanos");
		mes=la.nextInt();
		System.out.println("Teclea tu ano de nacimiento");
		ano=la.nextInt();
		System.out.println("Teclea el dia de hoy");
		dia2=la.nextInt();
		System.out.println("Teclea el mes en que estas");
		mes2=la.nextInt();
		if(mes<mes2){
			
				edad=ano2-ano;
				System.out.println("Tu edad es"+edad);
			}else{
				if(mes==mes2){
					if(dia<=dia2){
						edad=ano2-ano;
						System.out.println("Tu edad es"+edad);
					}else {
						ano=ano+1;
						edad=ano2-ano;
						System.out.println("Tu edad es"+edad);
					}
				}
			}
		if(mes>mes2) {
			ano=ano+1;
			
			edad=ano2-ano;
			System.out.println("Tu edad es"+edad);
		}
	}

}
