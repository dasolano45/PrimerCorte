import java.util.Scanner;
public class Punto6Act3 {

	public static void main(String[] args) {
		Scanner tiempo=new Scanner(System.in);
		int horas,minutos,segundos;
		System.out.print("digite la cantidad de horas: ");
		horas=tiempo.nextInt();
		System.out.print("digite la cantidad de minutos: ");
		minutos=tiempo.nextInt();
		System.out.print("digite la cantidad de segundos: ");
		segundos=tiempo.nextInt();
		int TotalSegundos= horas* 60 + minutos* 60+ segundos;
		System.out.println("la cantidad total de segundos es de "+TotalSegundos);
	}

}
