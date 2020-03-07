package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("CAMINHO PARA CRIAÇÃO DA PASTA: ");
		String path = sc.nextLine();

		System.out.println("PALAVRA EM INGLÊS: ");
		String word = sc.nextLine();

		System.out.println("QUANTIDADE DE REPETEIÇÕES: ");
		Integer rep = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= rep; i++) {
			System.out.println(i + "ª PALAVRA: ");
			String words = sc.nextLine();
			list.add(words);
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : list) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("ERROR!!! ==> " + e.getMessage());
		}

		sc.close();
	}
}