import java.util.Scanner;

public class atv3_revisao_algoritmos_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float basemenor;
		float basemaior;
		float altura;
		float area;
		
		System.out.println("Digite a base menor:");
		basemenor = sc.nextFloat();
		
		System.out.println("Digite a base maior:");
		basemaior = sc.nextFloat();
		
		System.out.println("Digite a altura:");
		altura = sc.nextFloat();
		
		area = (basemenor + basemaior)* altura / 2;
		
		System.out.println("A área do trapésio é: " + area);
		
	}

}
