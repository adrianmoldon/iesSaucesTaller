import java.util.Scanner;
public class E05{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		float r;
		final float PI=3.14159f;
		System.out.println("Dame el radio de una esfera");
		r=teclado.nextFloat();
		System.out.println("El volumen de la esfera es "+4*PI*(r*r*r)/3);
		
	}		
}
