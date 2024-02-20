import java.util.Scanner;
public class Punto7Act3 {

	public static void main(String[] args) {
		Scanner panorama=new Scanner(System.in);
        int dias;
        System.out.print("digite la cantidad de dias: ");
        dias=panorama.nextInt();
        int anios = dias / 365;
        int diasRestantes = dias % 365;
        int meses = diasRestantes / 30;
        System.out.println("la cantidad de meses son de "+meses);  
        System.out.println("la cantidad de años son de "+anios);
	}

}