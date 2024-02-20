import java.util.Scanner;
public class Punto8Act3 {

	public static void main(String[] args) {
	  Scanner digitador=new Scanner(System.in);
	  int PrecioProducto,Porcentaje,Recargo;
	  System.out.print("digite el precio del producto: ");
	  PrecioProducto=digitador.nextInt();
	  System.out.print("digite porcentaje el descuento: ");
	  Porcentaje=digitador.nextInt();
	  int descuento=Porcentaje*(PrecioProducto/100);
	  System.out.println("el descuento es de "+descuento+"$");
	  System.out.print("digite el porcentaje del recargo: ");
	  Recargo=digitador.nextInt();
	  int porcentaje=Recargo*(PrecioProducto/100);
	  System.out.println("el recargo es de "+porcentaje+"$");
	  int sumaTotal=PrecioProducto-descuento-porcentaje;
	  System.out.println("el precio total del producto es de $"+sumaTotal);
	}

}
