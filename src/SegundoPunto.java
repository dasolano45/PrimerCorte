import java.util.Scanner;
public class SegundoPunto {

	public static void main(String[] args) {
	    float notas,notas1,notas2,promedio;
		Scanner r=new Scanner(System.in);
		System.out.print("ingrese la primera nota: ");
		notas=r.nextFloat();
		System.out.print("ingrese la segunda nota: ");
		notas1=r.nextFloat();
		System.out.print("ingrese la tercera nota: ");
		notas2=r.nextFloat();
		promedio=(notas+notas1+notas2)/3;
		System.out.println("el promedio acumulado es de " +promedio);
	}

}
