import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] nota = new float[4];
		
		for(int x = 0; x < 4; x++) {
			System.out.print("Insira a " + (x + 1) + "ª nota: ");
			nota[x] = entrada.nextFloat();
		}
		
		float soma = 0;
		
		for(int x = 0; x < 4; x++) {
			System.out.print("\n" + (x + 1) + "ª nota: " + nota[x]);
			soma += nota[x];
		}
		
		System.out.print("\nMédia do aluno: " + (soma / 4));
		
		entrada.close();
	}
}
