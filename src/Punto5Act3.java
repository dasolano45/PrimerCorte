import java.util.Scanner;
public class Punto5Act3 {

	public static void main(String[] args) {
		Scanner conversiones=new Scanner(System.in);
		double millas=0;
		double horas=0;
		System.out.print("digite la cantidad de millas: ");
		millas=conversiones.nextDouble();
		System.out.print("digite la cantidad de horas: ");
		horas=conversiones.nextDouble();
		double VelocidadPromedio=millas/horas;
		System.out.println("la velocidad promedio es de "+VelocidadPromedio+" mi/h");
	}

}
