import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] media = new float[10];
		
		float soma;
		int quantApv = 0;
		
		for(int i = 0; i < 10; i++) {
			soma = 0;
			for(int j = 1; j <= 4; j++) {
				System.out.print("Insira a " + j + "� nota do " + (i + 1) + "� aluno: ");
				soma += entrada.nextFloat();
			}
			media[i] = soma / 4;
			System.out.print("\nM�dia do " + (i + 1) + "� aluno: " + media[i] + "\n\n");
			if(media[i] >= 7)
				quantApv++;
		}
		
		System.out.print("Quantidade de alunos com m�dia maior ou igual a 7,0: " + quantApv);
		
		entrada.close();
	}
}