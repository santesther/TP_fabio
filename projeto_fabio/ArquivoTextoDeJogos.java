package projeto_fabio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTextoDeJogos implements ArquivoDeJogos {
	
	@Override
	public void lerDoArquivoParaMemoria(ColecaoDeJogos listaDeJogos) {
		FileReader arquivoDeEntrada = null;
		BufferedReader leituraBufferizada;
		String linhaLidaDoArquivo;
		Jogo jogo;
		
		try {
			arquivoDeEntrada = new FileReader("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
			leituraBufferizada = new BufferedReader(arquivoDeEntrada);

			linhaLidaDoArquivo = leituraBufferizada.readLine();
			while (linhaLidaDoArquivo != null) {
				System.out.println(linhaLidaDoArquivo);
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
		
		try {
			arquivoDeEntrada.close();
		} 
		catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("Erro: Arquivo não encontrado!");
			e.printStackTrace();
		}
	}
	
	private Jogo criarObjetoJogo(String linhaLidaDoArquivo) {
		String nomeDoJogo, plataforma;
		int ano;
		double vendasGlobais;
		String camposDoArquivo[];
		
		camposDoArquivo = linhaLidaDoArquivo.split(",");
		System.out.println(camposDoArquivo[0] + "," + camposDoArquivo[1] + "," + camposDoArquivo[2] + "," + camposDoArquivo[3]);
		nomeDoJogo = camposDoArquivo[0];
		plataforma = camposDoArquivo[1];
		ano = Integer.parseInt(camposDoArquivo[2]);			
		vendasGlobais = Double.parseDouble(camposDoArquivo[3]);
		return new Jogo(nomeDoJogo, plataforma, ano, vendasGlobais);
	}

	@Override
	public void escreverDaMemoriaNoArquivo(ColecaoDeJogos listaDeJogos) {
		FileWriter arquivoDeSaida = null;
		String nomeDoJogo, plataforma;
		int ano;
		double vendasGlobais;
		try {
			arquivoDeSaida = new FileWriter("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
			int totalDeJogos = listaDeJogos.obterTotalDeJogos();
			
			for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) {
				nomeDoJogo = listaDeJogos.obterJogo(indiceDoJogo).obterNome();
				plataforma = listaDeJogos.obterJogo(indiceDoJogo).obterPlataforma();
				ano = listaDeJogos.obterJogo(indiceDoJogo).obterAno();
				vendasGlobais = listaDeJogos.obterJogo(indiceDoJogo).obterVendasGlobais();
				arquivoDeSaida.write(nomeDoJogo + "," + plataforma + "," + ano + "," + vendasGlobais + "\n");				
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
		} 
		catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("Erro: Arquivo não encontrado!");
			e.printStackTrace();
		}
	}

}