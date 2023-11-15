import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char[] letra = new char[10];
		int quantCon = 0;
		
		for(int x = 0; x < 10; x++) {
			System.out.print("Insira a " + (x + 1) + "ª letra: ");
			letra[x] = entrada.next().charAt(0);
			if(letra[x] != 'A' && letra[x] != 'a' && letra[x] != 'E' && letra[x] != 'e' && letra[x] != 'I'
				&& letra[x] != 'i' && letra[x] != 'O' && letra[x] != 'o' && letra[x] != 'U' && letra[x] != 'u')
				quantCon++;
		}
		
		if(quantCon > 0) {
			System.out.print("\nForam informadas " + quantCon + " consoantes, sendo estas: ");
			for(int x = 0; x < 10; x++) {
				if(letra[x] != 'A' && letra[x] != 'a' && letra[x] != 'E' && letra[x] != 'e' && letra[x] != 'I'
					&& letra[x] != 'i' && letra[x] != 'O' && letra[x] != 'o' && letra[x] != 'U' 
					&& letra[x] != 'u')
					System.out.print(letra[x] + " ");
			}
		} else
			System.out.print("\nNenhuma consoante foi informada.");
		
		entrada.close();
	}
}