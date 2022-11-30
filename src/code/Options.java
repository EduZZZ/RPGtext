package code;

import java.io.IOException;
import java.util.Scanner;

public class Options {

	static Scanner scan = new Scanner(System.in);
	static long milisPorChar = 1;
	static boolean fim = false;

	public static void opJogar() throws InterruptedException, IOException {

		int contPontos = 0;

		String resposta = null;

		for (int i = 0; i < 10; i++) {

			String altA = "a) ", altB = "b) ", altC = "c) ", altD = "d) ";
			String aux1 = "";

			System.out.println("\n");
			Functions.digita(Texts.historia[i], milisPorChar);
			System.out.println("\n");
			Functions.digita(Texts.enunciado[i], milisPorChar);
			System.out.println();

			System.out.println();
			aux1 = Texts.alternativaA[i];
			aux1 = altA.concat(aux1);
			Functions.digita(aux1, milisPorChar);
			System.out.println();

			aux1 = Texts.alternativaB[i];
			aux1 = altB.concat(aux1);
			Functions.digita(aux1, milisPorChar);
			System.out.println();

			aux1 = Texts.alternativaC[i];
			aux1 = altC.concat(aux1);
			Functions.digita(aux1, milisPorChar);
			System.out.println();

			aux1 = Texts.alternativaD[i];
			aux1 = altD.concat(aux1);
			Functions.digita(aux1, milisPorChar);
			System.out.println();

			do {
				System.out.println("Digite sua resposta: ");
				resposta = scan.nextLine();

				resposta = resposta.toUpperCase();

				switch (resposta) {

				case "A":
					if (Texts.respostaCerta[i].equalsIgnoreCase(Texts.alternativaA[i])) {
						Functions.digita(Texts.respostaPositiva[i], milisPorChar);
						contPontos++;
						fim = false;
					} else {
						Functions.digita(Texts.respostaNegativa[i], milisPorChar);

						fim = false;
					}
					break;

				case "B":
					if (Texts.respostaCerta[i].equalsIgnoreCase(Texts.alternativaB[i])) {
						Functions.digita(Texts.respostaPositiva[i], milisPorChar);
						contPontos++;
						fim = false;
					} else {
						Functions.digita(Texts.respostaNegativa[i], milisPorChar);
						fim = false;
					}
					break;

				case "C":
					if (Texts.respostaCerta[i].equalsIgnoreCase(Texts.alternativaC[i])) {
						Functions.digita(Texts.respostaPositiva[i], milisPorChar);
						contPontos++;
						fim = false;
					} else {
						Functions.digita(Texts.respostaNegativa[i], milisPorChar);
						fim = false;
					}
					break;

				case "D":
					if (Texts.respostaCerta[i].equalsIgnoreCase(Texts.alternativaD[i])) {
						Functions.digita(Texts.respostaPositiva[i], milisPorChar);
						contPontos++;
						fim = false;
					} else {
						Functions.digita(Texts.respostaNegativa[i], milisPorChar);
						fim = false;
					}
					break;

				default:
					Functions.digita("Alternativa Invalida! Vamos tentar novamente.", milisPorChar);
					fim = true;
					break;
				}
			} while (fim == true);

		}
		Functions.digita("\nPONTOS: " + contPontos + "\nParabéns " + Main.nomeJogador
				+ ", sua pontuação foi registrada no placar de líderes!!!", milisPorChar);
		String registroPlacar = contPontos + " - " + Main.nomeJogador;
		Functions.atualizarPlacar(registroPlacar);

		do {
			Functions.digita("Deseja voltar ao menu? \n1 - Sim \n2 - Não\n", milisPorChar);
			int res = scan.nextInt();
			if (res == 1) {
				Functions.menu();
			} else if (res == 2) {
				Options.opSair();
			} else {
				Functions.digita("Opção Inválida!\n", milisPorChar);
				fim = true;
			}
		} while (fim == true);

	}

	static void opSair() throws InterruptedException, IOException {
		System.exit(0);

	}

	static void opPlacar() throws InterruptedException, IOException {
		Functions.digita("##### PLACAR DE LIDERES ####\n", milisPorChar);
		Functions.digita(Functions.ler("./PlacarLideres.txt"), milisPorChar);
		do {
			Functions.digita("Deseja voltar ao menu? \n1 - Sim \n2 - Não\n", milisPorChar);
			int resposta = scan.nextInt();
			if (resposta == 1) {
				Functions.menu();
			} else if (resposta == 2) {
				Options.opSair();
			} else {
				Functions.digita("Opção Inválida!\n", milisPorChar);
				fim = true;
			}
		} while (fim == true);

	}
}
