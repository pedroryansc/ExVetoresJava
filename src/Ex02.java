import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] vet = new float[10];
		
		for(int x = 0; x < 10; x++) {
			System.out.print("Insira o " + (x + 1) + "º número: ");
			vet[x] = entrada.nextFloat();
		}
		
		for(int x = 9; x >= 0; x--)
			System.out.print("| " + vet[x] + " |");
		
		/*
		for(int x = 1; x <= 10; x++)
			System.out.print("| " + vet[10 - x] + " |");
		*/
		
		entrada.close();
	}
}