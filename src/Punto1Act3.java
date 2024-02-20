import java.util.Scanner;
public class Punto1Act3 {

	public static void main(String[] args) {
		Scanner tiempo=new Scanner(System.in);
		int edad_actual,años,años_futuro;
		System.out.print("ingrese su edad actual: ");
		edad_actual=tiempo.nextInt();
		System.out.print("ingrese la cantidad de años: ");
		años=tiempo.nextInt();
		años_futuro=edad_actual+años;
		System.out.println("dentro de " +años+" años usted tendrá "+años_futuro+" años");
	}

}
