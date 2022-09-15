import java.util.Scanner; 

public class atv2_revisao_algoritmos_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float peso;
		float altura;
		float IMC;
		
		System.out.println("Insira o seu peso em kg:");
		peso = sc.nextFloat();
				
		System.out.println("Insira sua altura em m:");
		altura = sc.nextFloat();
				
		IMC = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + IMC);		
	}

}
