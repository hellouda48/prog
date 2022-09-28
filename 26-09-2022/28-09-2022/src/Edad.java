import java.util.Scanner;

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
		mes2=9;
		int edad;
		System.out.println("Teclea el dia");
		dia=la.nextInt();
		System.out.println("Teclea el mes");
		mes=la.nextInt();
		System.out.println("Teclea el año");
		año=la.nextInt();
		System.out.println("Teclea el dia de hoy");
		dia2=la.nextInt();
	
		if(mes<mes2){
			
				edad=año2-año;
				System.out.println("Tu edad es"+edad);
			}else{
				if(mes==mes2){
					if(dia<dia2){
						edad=año2-año;
						System.out.println("Tu edad es"+edad);
					}
				}
			}
		}
		
	}


