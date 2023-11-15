import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um texto: ");
		String texto = entrada.nextLine();
		
		char[] caracter = new char[texto.length()];
		
		for(int x = 0; x < texto.length(); x++) {
			caracter[x] = texto.charAt(x);
			System.out.print(caracter[x] + " ");
		}
		
		/*
		String[] caracter = texto.split("");
		
		for(int x = 0; x < caracter.length; x++)
			System.out.print(caracter[x] + " ");
		
		*/
		
		entrada.close();
	}
}