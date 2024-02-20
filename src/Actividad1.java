import java.util.Scanner;
public class Actividad1 {
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		int numero=0;
		int numero2=0;
		int suma;
		int multiplicacion;
		System.out.print("digite el primer numero: ");
		numero=tec.nextInt();
		System.out.print("digite el segundo numero: ");
		numero2=tec.nextInt();
		suma=numero+numero2;
		System.out.println("el resultado de la suma es: " +suma);
		multiplicacion=numero*numero2;
		System.out.println("el resultado de la multiplicacion es: " +multiplicacion);
		
	}

}
