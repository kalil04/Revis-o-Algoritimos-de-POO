import java.util.Scanner;

public class atv5_revisao_algoritmos_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();	
		
		if(numero % 2 == 0) {
			System.out.println(numero +" é par");
			
		}else {
			System.out.println(numero +" é impar");
		}
		
	}
}
