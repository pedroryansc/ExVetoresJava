import java.util.Scanner;

public class Ex07{
	public static void main(String[] ars) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[5];
		int soma = 0;
		int multi = 1;
		
		for(int x = 0; x < 5; x++) {
			System.out.print("Insira o " + (x + 1) + "� n�mero inteiro: ");
			vet[x] = entrada.nextInt();
			soma += vet[x];
			multi *= vet[x];
		}
		
		System.out.print("\nN�meros: ");
		for(int x = 0; x < 5; x++)
			System.out.print(vet[x] + " ");
		
		System.out.print("\nSoma dos n�meros: " + soma + "\n"
						+ "Multiplica��o dos n�meros: " + multi);
			
		entrada.close();
	}
}