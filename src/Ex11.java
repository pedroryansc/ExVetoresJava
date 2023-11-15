import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um texto: ");
		String texto = entrada.nextLine();
		
		String[] vetTexto = texto.split(";");
		
		for(int x = 0; x < vetTexto.length; x++)
			System.out.print("\n" + vetTexto[x]);
		
		entrada.close();
	}
}