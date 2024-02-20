import java.util.Scanner;
public class PracticaAct3 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		double K,C;
		System.out.println("ingrese la temperatura kelvin: ");
		K=num.nextFloat();
		C=K-273.15;
		System.out.println("la temperatura convertida kelvin es de " + C +" grados celsius");

	}

}
