package code;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Functions {

	static Scanner scan = new Scanner(System.in);
	static long milisPorChar = 1;

	static void menu() throws InterruptedException, IOException {

		Functions.digita(Texts.menu[1], milisPorChar);
		System.out.println();

		switch (scan.nextInt()) {
		case 1:
			Options.opJogar();
			break;
		case 2:
			Options.opPlacar();
			break;

		case 3:
			Options.opSair();
			break;
		default:
			System.out.println("Opção Invalida! Digite Novamente\n");
			Functions.menu();
			break;
		}

	}

	public static String ler(String path) throws IOException {
		File url = new File(path);
		String dados = new String(Files.readAllBytes(url.toPath()));
		return dados;
	}

	public static void digita(String mensagem, long milisPorChar) throws InterruptedException {
		for (int i = 0; i < mensagem.length(); i++) {

			System.out.print(mensagem.charAt(i));
			Thread.sleep(milisPorChar);
		}
	}

	public static void atualizarPlacar(String line) {
		Path path = Path.of("PlacarLideres.txt");
		try {
			if (!Files.exists(path)) {
				Files.createFile(path);
			}

			List<String> lines = Files.readAllLines(path);

			lines.add(line);

			Collections.sort(lines, (String a, String b) -> {
				int pointsA = Integer.parseInt(a.split("-")[0].trim());
				int pointsB = Integer.parseInt(b.split("-")[0].trim());

				return Integer.compare(pointsB, pointsA);
			});

			Files.write(path, lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
