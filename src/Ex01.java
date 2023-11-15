import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[5];
		
		for(int x = 0; x < 5; x++) {
			System.out.print("Insira o " + (x + 1) + "º número: ");
			vet[x] = entrada.nextInt();
		}
		
		for(int x = 0; x < 5; x++)
			System.out.print(vet[x] + " ");
		
		entrada.close();
	}
}