import java.util.Scanner;

public class atv4_revisao_algoritmos_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Digite um número:");
		numero1 = sc.nextInt();
		
		System.out.println("Digite outro número:");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println(numero1 +" é maior");
			
		}else {
			System.out.println(numero2 +" é maior");
		}
		
	}

}
