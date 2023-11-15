import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] num = new int[20];
		
		int[] par = new int[20];
		int[] impar = new int[20];
		
		int quantPar = 0;
		int quantImpar = 0;
		
		for(int x = 0; x < 20; x++) {
			System.out.print("Insira o " + (x + 1) + "º número inteiro: ");
			num[x] = entrada.nextInt();
			if(num[x] % 2 == 0) {
				par[quantPar] = num[x];
				quantPar++;
			} else {
				impar[quantImpar] = num[x];
				quantImpar++;
			}
		}
		
		System.out.print("\nVetor Números: ");
		for(int x = 0; x < 20; x++)
			System.out.print(num[x] + " ");
		
		System.out.print("\nVetor Par: ");
		if(quantPar > 0) {
			for(int x = 0; x < quantPar; x++)
				System.out.print(par[x] + " ");
		} else
			System.out.print("Nenhum número par foi informado.");
			
		System.out.print("\nVetor Ímpar: ");
		if(quantImpar > 0) {
			for(int x = 0; x < quantImpar; x++)
				System.out.print(impar[x] + " ");
		} else
			System.out.print("Nenhum número ímpar foi informado.");
		
		entrada.close();
	}
}
