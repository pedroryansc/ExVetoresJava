import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		
		int[] idade = new int[TAM];
		float[] alt = new float[TAM];
		
		int maisVelho = 0;
		int maisNovo = 0;
		
		int somaIdade = 0;
		
		int maisBaixo = 0;
		int maisAlto = 0;
		
		float somaAlt = 0;
		
		for(int x = 0; x < TAM; x++) {
			System.out.print("Insira a idade da " + (x + 1) + "ª pessoa: ");
			idade[x] = entrada.nextInt();
			
			if(idade[x] > idade[maisVelho])
				maisVelho = x;
			else if(idade[x] < idade[maisNovo])
				maisNovo = x;
			
			somaIdade += idade[x];
			
			System.out.print("Insira a altura da " + (x + 1) + "ª pessoa: ");
			alt[x] = entrada.nextFloat();
			
			if(alt[x] < alt[maisBaixo])
				maisBaixo = x;
			else if(alt[x] > alt[maisAlto])
				maisAlto = x;
			
			somaAlt += alt[x];
		}
		
		for(int x = TAM - 1; x >= 0; x--) {
			System.out.print("\nIdade da " + (x + 1) + "ª pessoa: " + idade[x] + "\n"
								+ "Altura da " + (x + 1) + "ª pessoa: " + alt[x]);
		}
		
		System.out.println("\n\nIdade da pessoa mais velha: " + idade[maisVelho] + "\n"
							+ "Altura da pessoa mais velha: " + alt[maisVelho]);
		
		System.out.println("\nIdade da pessoa mais nova: " + idade[maisNovo] + "\n"
							+ "Altura da pessoa mais nova: " + alt[maisNovo]);
		
		System.out.println("\nIdade da pessoa mais baixa: " + idade[maisBaixo] + "\n"
							+ "Altura da pessoa mais baixa: " + alt[maisBaixo]);
		
		System.out.println("\nIdade da pessoa mais alta: " + idade[maisAlto] + "\n"
							+ "Altura da pessoa mais alta: " + alt[maisAlto]);
		
		float mediaIdade = somaIdade / TAM;
		float mediaAlt = somaAlt / TAM;
		
		int cont = 0;
		
		System.out.println("\nPessoas abaixo da média de idade (" + mediaIdade + "): ");
		for(int x = 0; x < 5; x++) {
			if(idade[x] < mediaIdade) {
				System.out.println("Idade: " + idade[x] + "; Altura: " + alt[x]);
				cont++;
			}
		}
		if(cont == 0)
			System.out.println("Nenhuma pessoa tem a idade abaixo da média.");
		
		cont = 0;
		
		System.out.println("\nPessoas acima da média de idade (" + mediaIdade + "): ");
		for(int x = 0; x < 5; x++) {
			if(idade[x] > mediaIdade) {
				System.out.println("Idade: " + idade[x] + "; Altura: " + alt[x]);
				cont++;
			}
		}
		if(cont == 0)
			System.out.println("Nenhuma pessoa tem a idade acima da média.");
		
		cont = 0;
		
		System.out.println("\nPessoas abaixo da média de altura (" + mediaAlt + "): ");
		for(int x = 0; x < 5; x++) {
			if(alt[x] < mediaAlt) {
				System.out.println("Idade: " + idade[x] + "; Altura: " + alt[x]);
				cont++;
			}
		}
		if(cont == 0)
			System.out.println("Nenhuma pessoa tem a altura abaixo da média.");
		
		cont = 0;
		
		System.out.println("\nPessoas acima da média de altura (" + mediaAlt + "): ");
		for(int x = 0; x < 5; x++) {
			if(alt[x] > mediaAlt) {
				System.out.println("Idade: " + idade[x] + "; Altura: " + alt[x]);
				cont++;
			}
		}
		if(cont == 0)
			System.out.println("Nenhuma pessoa tem a altura acima da média.");
		
		entrada.close();
	}
}