package ProgramaDisponibilizado2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class arquivoTextoDeJogos implements ArquivoDeJogos { 

	String nomeDoArquivo = "D:/Desktop/jogosArquivo.txt";
	
	@Override
	public void lerDoArquivoParaMemoria(ColecaoDeJogos listaDeJogos) {
		FileReader arquivoDeEntrada = null;
		BufferedReader leituraBufferizada;
		String linhaLidaDoArquivo;
		Jogo jogo;

		try {
			arquivoDeEntrada = new FileReader(nomeDoArquivo);
			leituraBufferizada = new BufferedReader(arquivoDeEntrada);

			linhaLidaDoArquivo = leituraBufferizada.readLine();
			while (linhaLidaDoArquivo != null) {
				jogo = criarObjetoJogo(linhaLidaDoArquivo);
				listaDeJogos.adicionarJogo(jogo);
				linhaLidaDoArquivo = leituraBufferizada.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		}
	}

	private Jogo criarObjetoJogo(String linhaLidaDoArquivo) {
		String nomeDoJogo, plataforma;
		int ano;
		double vendasGlobais;
		String camposDoArquivo[];
		camposDoArquivo = linhaLidaDoArquivo.split(",");
		nomeDoJogo = camposDoArquivo[0];
		plataforma = camposDoArquivo[1];
		ano = Integer.parseInt(camposDoArquivo[2]);
		vendasGlobais = Double.parseDouble(camposDoArquivo[3]);
		return new Jogo(nomeDoJogo, plataforma, ano, vendasGlobais);
	}

	@Override
	public void escreverDaMemoriaNoArquivo(ColecaoDeJogos listaDeJogos, int tipo) {
		FileWriter arquivoDeSaida = null;
		String nomeDoJogo, plataforma;
		int ano;
		double vendasGlobais;
		try {
			arquivoDeSaida = new FileWriter(nomeDoArquivo);
			int totalDeJogos = listaDeJogos.obterTotalDeJogos();
			if (tipo == 1 || tipo == 2)
			{
				for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) 
				{
					nomeDoJogo = listaDeJogos.obterJogo(indiceDoJogo).obterNome();
					plataforma = listaDeJogos.obterJogo(indiceDoJogo).obterPlataforma();
					ano = listaDeJogos.obterJogo(indiceDoJogo).obterAno();
					vendasGlobais = listaDeJogos.obterJogo(indiceDoJogo).obterVendasGlobais();
					arquivoDeSaida.write(nomeDoJogo + "," + plataforma + "," + ano + "," + vendasGlobais + "\n");
				}
			} else
			{
				Iterador iteradorEscrita = listaDeJogos.obterIterador();
				while (iteradorEscrita.temProximo()) {
					Jogo jogo = iteradorEscrita.obterElemento();
					nomeDoJogo = jogo.obterNome();
					plataforma = jogo.obterPlataforma();
					ano = jogo.obterAno();
					vendasGlobais = jogo.obterVendasGlobais();
					arquivoDeSaida.write(nomeDoJogo + "," + plataforma + "," + ano + "," + vendasGlobais + "\n");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		}

		try {
			arquivoDeSaida.close();
		} catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Erro: Arquivo não encontrado!");
			e.printStackTrace();
		}
	}
}
