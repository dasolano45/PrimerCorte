import java.util.Scanner;
public class Punto3Act3 {

	public static void main(String[] args) {
		Scanner medidas=new Scanner(System.in);
		int area,b,h;
		System.out.print("ingrese la base del triangulo: ");
		b=medidas.nextInt();
		System.out.print("ingrese la altura del triangulo: ");
		h=medidas.nextInt();
		area=(b*h)/2;
		System.out.println("el area del triangulo es de "+area+ " metros cuadrados");
	}

}
