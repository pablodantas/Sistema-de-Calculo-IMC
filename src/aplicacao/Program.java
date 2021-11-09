package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		String path = "C:\\Users\\Pablo\\Documents\\ws-eclipse\\ler_arquivo\\in.txt";

		List<Product> list = new ArrayList<Product>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(";");

				String name = vect[0];
				Double peso = Double.parseDouble(vect[1]);
				Double altura = Double.parseDouble(vect[2]);

				Product prod = new Product(name, altura, peso);
				list.add(prod);

				line = br.readLine();

			}
			System.out.println("Products");

			for (Product p : list) {
				System.out.println(p);
			}
		} catch (IOException e) {
			System.out.println("ERRO" + e.getMessage());
		}

		try {

			FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
			PrintWriter pr = new PrintWriter(arquivo);

			for (Product p : list) {
				pr.println(p);
			}

			pr.close();
			arquivo.close();

		} catch (Exception e) {
			System.out.println("Erro ao escrever o arquivo");
		}

	}

}
