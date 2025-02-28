import java.util.Scanner;
public class E03{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n1,n2,cociente;
		System.out.println("Dame un numero");
		n1=teclado.nextInt();
		System.out.println("Dame otro numero");
		n2=teclado.nextInt();
		cociente=(n1/n2);
		System.out.println("El cociente de "+n1+" y "+n2+" es "+cociente);
		System.out.println("El resto es "+n1%n2);
	}		
}
