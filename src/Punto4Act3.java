import java.util.Scanner;
public class Punto4Act3 {

	public static void main(String[] args) {
		Scanner plata=new Scanner(System.in);
		int dinero;
		int porcentaje_propina=0;
		System.out.print("ingrese la cantidad de dinero que cuenta: ");
		dinero=plata.nextInt();
		System.out.print("ingrese el porcentaje de la propina: ");
		porcentaje_propina=plata.nextInt();
		int propina=porcentaje_propina*(dinero/100);
		int totalAPagar=propina+dinero;
		System.out.println("el monto de la cuenta es de: "+dinero);
		System.out.println("el porcentaje de la propina es de "+porcentaje_propina+"%");
		System.out.println("la propina es de "+propina+ "$");
		System.out.println("la cuenta total a pagar es de "+totalAPagar+ "$");
		
	}

}
