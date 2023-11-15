import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String data;
		String[] vetData;
		
		do {
			System.out.print("Insira uma data no formato dd/mm/aaaa: ");
			data = entrada.next();
			vetData = data.split("/");
		} while(vetData[0].length() != 2 || vetData[1].length() != 2 || vetData[2].length() <= 0 
				|| vetData.length != 3);
		
		System.out.print("\nDia: " + vetData[0] + "\n"
						+ "Mês: " + vetData[1] + "\n"
						+ "Ano: " + vetData[2]);
		
		entrada.close();
	}
}