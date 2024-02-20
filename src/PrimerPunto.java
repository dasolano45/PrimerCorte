import java.util.Scanner;
public class PrimerPunto {

	public static void main(String[] args) {
	  Scanner figura=new Scanner(System.in);
	  int base,altura,area;
	  System.out.print("coloque la base de la figura: ");
	  base=figura.nextInt();
	  System.out.print("anexe la altura de la figura: ");
	  altura=figura.nextInt();
	  area=(base*altura);
	  System.out.println("el area del rectangulo es de " +area+"cm");
	}

}
