package code;

import java.io.IOException;

public class Texts {

	static String historia[] = new String[10];
	static String menu[] = new String[10];
	static String enunciado[] = new String[10];
	static String alternativaA[] = new String[10];
	static String alternativaB[] = new String[10];
	static String alternativaC[] = new String[10];
	static String alternativaD[] = new String[10];
	static String respostaPositiva[] = new String[10];
	static String respostaNegativa[] = new String[10];
	static String respostaCerta[] = new String[10];

	static void texts() throws IOException {
		
		// Vetor com os textos de menu
		
		menu[0] = Functions.ler("./textos/Menu/Intro.txt");
		menu[1] = Functions.ler("./textos/Menu/MenuPrincipal.txt");

		// Vetor com os textos da História

		historia[0] = Functions.ler("./textos/Historia/Historia0.txt");
		historia[1] = Functions.ler("./textos/Historia/Historia1.txt");
		historia[2] = Functions.ler("./textos/Historia/Historia2.txt");
		historia[3] = Functions.ler("./textos/Historia/Historia3.txt");
		historia[4] = Functions.ler("./textos/Historia/Historia4.txt");
		historia[5] = Functions.ler("./textos/Historia/Historia5.txt");
		historia[6] = Functions.ler("./textos/Historia/Historia6.txt");
		historia[7] = Functions.ler("./textos/Historia/Historia7.txt");
		historia[8] = Functions.ler("./textos/Historia/Historia8.txt");
		historia[9] = Functions.ler("./textos/Historia/Historia9.txt");

		// Vetor com os enunciados das questões

		enunciado[0] = Functions.ler("./textos/Enunciado/Enunciado0.txt");
		enunciado[1] = Functions.ler("./textos/Enunciado/Enunciado1.txt");
		enunciado[2] = Functions.ler("./textos/Enunciado/Enunciado2.txt");
		enunciado[3] = Functions.ler("./textos/Enunciado/Enunciado3.txt");
		enunciado[4] = Functions.ler("./textos/Enunciado/Enunciado4.txt");
		enunciado[5] = Functions.ler("./textos/Enunciado/Enunciado5.txt");
		enunciado[6] = Functions.ler("./textos/Enunciado/Enunciado6.txt");
		enunciado[7] = Functions.ler("./textos/Enunciado/Enunciado7.txt");
		enunciado[8] = Functions.ler("./textos/Enunciado/Enunciado8.txt");
		enunciado[9] = Functions.ler("./textos/Enunciado/Enunciado9.txt");

		// Vetor com as alternativas das questões

		alternativaA[0] = Functions.ler("./textos/Alternativa/A/Alternativa0.txt");
		alternativaA[1] = Functions.ler("./textos/Alternativa/A/Alternativa1.txt");
		alternativaA[2] = Functions.ler("./textos/Alternativa/A/Alternativa2.txt");
		alternativaA[3] = Functions.ler("./textos/Alternativa/A/Alternativa3.txt");
		alternativaA[4] = Functions.ler("./textos/Alternativa/A/Alternativa4.txt");
		alternativaA[5] = Functions.ler("./textos/Alternativa/A/Alternativa5.txt");
		alternativaA[6] = Functions.ler("./textos/Alternativa/A/Alternativa6.txt");
		alternativaA[7] = Functions.ler("./textos/Alternativa/A/Alternativa7.txt");
		alternativaA[8] = Functions.ler("./textos/Alternativa/A/Alternativa8.txt");
		alternativaA[9] = Functions.ler("./textos/Alternativa/A/Alternativa9.txt");

		alternativaB[0] = Functions.ler("./textos/Alternativa/B/Alternativa0.txt");
		alternativaB[1] = Functions.ler("./textos/Alternativa/B/Alternativa1.txt");
		alternativaB[2] = Functions.ler("./textos/Alternativa/B/Alternativa2.txt");
		alternativaB[3] = Functions.ler("./textos/Alternativa/B/Alternativa3.txt");
		alternativaB[4] = Functions.ler("./textos/Alternativa/B/Alternativa4.txt");
		alternativaB[5] = Functions.ler("./textos/Alternativa/B/Alternativa5.txt");
		alternativaB[6] = Functions.ler("./textos/Alternativa/B/Alternativa6.txt");
		alternativaB[7] = Functions.ler("./textos/Alternativa/B/Alternativa7.txt");
		alternativaB[8] = Functions.ler("./textos/Alternativa/B/Alternativa8.txt");
		alternativaB[9] = Functions.ler("./textos/Alternativa/B/Alternativa9.txt");

		alternativaC[0] = Functions.ler("./textos/Alternativa/C/Alternativa0.txt");
		alternativaC[1] = Functions.ler("./textos/Alternativa/C/Alternativa1.txt");
		alternativaC[2] = Functions.ler("./textos/Alternativa/C/Alternativa2.txt");
		alternativaC[3] = Functions.ler("./textos/Alternativa/C/Alternativa3.txt");
		alternativaC[4] = Functions.ler("./textos/Alternativa/C/Alternativa4.txt");
		alternativaC[5] = Functions.ler("./textos/Alternativa/C/Alternativa5.txt");
		alternativaC[6] = Functions.ler("./textos/Alternativa/C/Alternativa6.txt");
		alternativaC[7] = Functions.ler("./textos/Alternativa/C/Alternativa7.txt");
		alternativaC[8] = Functions.ler("./textos/Alternativa/C/Alternativa8.txt");
		alternativaC[9] = Functions.ler("./textos/Alternativa/C/Alternativa9.txt");

		alternativaD[0] = Functions.ler("./textos/Alternativa/D/Alternativa0.txt");
		alternativaD[1] = Functions.ler("./textos/Alternativa/D/Alternativa1.txt");
		alternativaD[2] = Functions.ler("./textos/Alternativa/D/Alternativa2.txt");
		alternativaD[3] = Functions.ler("./textos/Alternativa/D/Alternativa3.txt");
		alternativaD[4] = Functions.ler("./textos/Alternativa/D/Alternativa4.txt");
		alternativaD[5] = Functions.ler("./textos/Alternativa/D/Alternativa5.txt");
		alternativaD[6] = Functions.ler("./textos/Alternativa/D/Alternativa6.txt");
		alternativaD[7] = Functions.ler("./textos/Alternativa/D/Alternativa7.txt");
		alternativaD[8] = Functions.ler("./textos/Alternativa/D/Alternativa8.txt");
		alternativaD[9] = Functions.ler("./textos/Alternativa/D/Alternativa9.txt");

		// Vetores com as respostas postivas e negativa dependendo da resposta do
		// usuário á questão
		respostaPositiva[0] = Functions.ler("./textos/Resposta/Positiva/Positiva0.txt");
		respostaPositiva[1] = Functions.ler("./textos/Resposta/Positiva/Positiva1.txt");
		respostaPositiva[2] = Functions.ler("./textos/Resposta/Positiva/Positiva2.txt");
		respostaPositiva[3] = Functions.ler("./textos/Resposta/Positiva/Positiva3.txt");
		respostaPositiva[4] = Functions.ler("./textos/Resposta/Positiva/Positiva4.txt");
		respostaPositiva[5] = Functions.ler("./textos/Resposta/Positiva/Positiva5.txt");
		respostaPositiva[6] = Functions.ler("./textos/Resposta/Positiva/Positiva6.txt");
		respostaPositiva[7] = Functions.ler("./textos/Resposta/Positiva/Positiva7.txt");
		respostaPositiva[8] = Functions.ler("./textos/Resposta/Positiva/Positiva8.txt");
		respostaPositiva[9] = Functions.ler("./textos/Resposta/Positiva/Positiva9.txt");

		respostaNegativa[0] = Functions.ler("./textos/Resposta/Negativa/Negativa0.txt");
		respostaNegativa[1] = Functions.ler("./textos/Resposta/Negativa/Negativa1.txt");
		respostaNegativa[2] = Functions.ler("./textos/Resposta/Negativa/Negativa2.txt");
		respostaNegativa[3] = Functions.ler("./textos/Resposta/Negativa/Negativa3.txt");
		respostaNegativa[4] = Functions.ler("./textos/Resposta/Negativa/Negativa4.txt");
		respostaNegativa[5] = Functions.ler("./textos/Resposta/Negativa/Negativa5.txt");
		respostaNegativa[6] = Functions.ler("./textos/Resposta/Negativa/Negativa6.txt");
		respostaNegativa[7] = Functions.ler("./textos/Resposta/Negativa/Negativa7.txt");
		respostaNegativa[8] = Functions.ler("./textos/Resposta/Negativa/Negativa8.txt");
		respostaNegativa[9] = Functions.ler("./textos/Resposta/Negativa/Negativa9.txt");

		// Vetor com as respostas certas
		respostaCerta[0] = Functions.ler("./textos/Resposta/Certa/Certa0.txt");
		respostaCerta[1] = Functions.ler("./textos/Resposta/Certa/Certa1.txt");
		respostaCerta[2] = Functions.ler("./textos/Resposta/Certa/Certa2.txt");
		respostaCerta[3] = Functions.ler("./textos/Resposta/Certa/Certa3.txt");
		respostaCerta[4] = Functions.ler("./textos/Resposta/Certa/Certa4.txt");
		respostaCerta[5] = Functions.ler("./textos/Resposta/Certa/Certa5.txt");
		respostaCerta[6] = Functions.ler("./textos/Resposta/Certa/Certa6.txt");
		respostaCerta[7] = Functions.ler("./textos/Resposta/Certa/Certa7.txt");
		respostaCerta[8] = Functions.ler("./textos/Resposta/Certa/Certa8.txt");
		respostaCerta[9] = Functions.ler("./textos/Resposta/Certa/Certa9.txt");
		
		

	}

}
