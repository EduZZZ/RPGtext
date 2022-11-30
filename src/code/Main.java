package code;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	static long milisPorChar = 1;
	static String nomeJogador;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, IOException {

		Texts.texts();

		Functions.digita(Texts.menu[0], milisPorChar);

		Functions.digita("\nMatemático(a), para começarmos, por favor, diga-me o seu nome:\n", milisPorChar);
		
		nomeJogador = entrada.next();
		
		Functions.digita("\nSeja bem-vindo. \n", milisPorChar);
		Functions.digita("\nEntão bora lá, " + nomeJogador, milisPorChar);
		System.out.println();

		Functions.menu();
	}
}
