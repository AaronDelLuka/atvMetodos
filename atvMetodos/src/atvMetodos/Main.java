package atvMetodos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos preços de produtos você deseja somar? ");
		int quantidadePrecos = scanner.nextInt();

		double total = somarPrecos(quantidadePrecos);

		System.out.println("Total dos preços: R$ " + total);

		scanner.close();
	}

	public static double somarPrecos(int quantidadePrecos) {
		Scanner scanner = new Scanner(System.in);
		double total = 0.0;

		for (int i = 1; i <= quantidadePrecos; i++) {
			System.out.print("Informe o preço do produto #" + i + ": R$ ");
			double preco = scanner.nextDouble();
			total += preco;
		}

		return total;

	}

}
