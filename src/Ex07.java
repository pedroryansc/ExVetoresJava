import java.util.Scanner;

public class Ex07{
	public static void main(String[] ars) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[5];
		int soma = 0;
		int multi = 1;
		
		for(int x = 0; x < 5; x++) {
			System.out.print("Insira o " + (x + 1) + "º número inteiro: ");
			vet[x] = entrada.nextInt();
			soma += vet[x];
			multi *= vet[x];
		}
		
		System.out.print("\nNúmeros: ");
		for(int x = 0; x < 5; x++)
			System.out.print(vet[x] + " ");
		
		System.out.print("\nSoma dos números: " + soma + "\n"
						+ "Multiplicação dos números: " + multi);
			
		entrada.close();
	}
}