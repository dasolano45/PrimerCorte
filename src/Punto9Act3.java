import java.util.Scanner;
public class Punto9Act3 {

	public static void main(String[] args) {
      Scanner plata=new Scanner(System.in);
      double tasaCambio=150.26;
      int Montodolar;
      double MontoYen;
      System.out.print("digite la cantidad de dolares: ");
      Montodolar=plata.nextInt();
      MontoYen=Montodolar*tasaCambio;
      System.out.println("la cantidad de dinero de los "+Montodolar+" dolares equivale a "+MontoYen+" yen japones");
	}

}
