import java.util.Scanner;
public class TercerPunto {
  public static void main(String[] args) {
	  Scanner medidas=new Scanner(System.in);
	  int numero,centimetros;	  
	  float pulgadas;
	  System.out.print("digite la cantidad de metros que desea convertir a cm y in: ");
	  centimetros=medidas.nextInt(); 
	  System.out.println("el resultado de la conversion de m a cm es de " +centimetros*100+ " cm" );
	  pulgadas=medidas.nextFloat();
	  System.out.println("el resultado de la conversion de cm a in es de " +pulgadas/2.54+ " in");
	  
  }
}
