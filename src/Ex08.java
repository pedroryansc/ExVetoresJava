import java.util.Scanner;

import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		char[] letra = new char[26];
		
		letra[0] = 'a';
		letra[1] = 'e';
		letra[2] = 'i';
		letra[3] = 'o';
		letra[4] = 'u';
		letra[5] = 'b';
		letra[6] = 'c';
		letra[7] = 'd';
		letra[8] = 'f';
		letra[9] = 'g';
		letra[10] = 'h';
		letra[11] = 'j';
		letra[12] = 'k';
		letra[13] = 'l';
		letra[14] = 'm';
		letra[15] = 'n';
		letra[16] = 'p';
		letra[17] = 'q';
		letra[18] = 'r';
		letra[19] = 's';
		letra[20] = 't';
		letra[21] = 'v';
		letra[22] = 'w';
		letra[23] = 'x';
		letra[24] = 'y';
		letra[25] = 'z';
		
		int tam;
		
		do {
			System.out.print("Insira a quantidade de caracteres (menor ou igual a 25) da senha a ser gerada: ");
			tam = entrada.nextInt();
		} while(tam < 1 || tam > 25);
		
		char[] senha = new char[tam];
		
		System.out.print("\nSenha: ");
		for(int x = 0; x < tam; x++) {
			if((x + 1) % 2 != 0)
				senha[x] = letra[aleatorio.nextInt(5, 26)];
			else
				senha[x] = letra[aleatorio.nextInt(0, 5)];
			System.out.print(senha[x]);
		}
		
		entrada.close();
	}
}
