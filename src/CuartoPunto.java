import java.util.Scanner;
public class CuartoPunto {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int pesos_colombianos=0;
		System.out.print("ingrese el monto ingresado de pesos colombianos: ");
		pesos_colombianos=teclado.nextInt();
		System.out.println("la cantidad de dolares que tiene es de "+pesos_colombianos*1/3911.29+ " USD");

	}

}
