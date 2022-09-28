import java.util.*;
public class Calificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cal;
		
		Scanner la=new Scanner(System.in);
		
		System.out.println("Teclea la calificacion");
		cal=la.nextFloat();
		if((cal>=70)&&(cal<=100 )){
			System.out.println("La calificacion es aprobatoria");
		
	}else{
		if((cal<70)&&(cal>=0)){
		System.out.println("La calificacion es reprobatoria");
		}else{
			System.out.println("La calificacion no es valida");
		}
	}};
		
		
	}

