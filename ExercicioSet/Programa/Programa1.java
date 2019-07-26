package Programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Entidades.Usuario;

public class Programa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "E:\\JavaTemp\\Set\\Set1.txt";
		Set<Usuario> setUsu = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] copy = linha.split(" ");
				String nomeUsu = copy[0];
				Date momentoLog = Date.from(Instant.parse(copy[1]));
				setUsu.add(new Usuario(nomeUsu, momentoLog));
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Total de usuários únicos : "+ setUsu.size());
		sc.close();
	}

}
