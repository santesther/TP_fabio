package ProgramaDisponibilizado2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class tratamentoDeDados implements ArquivoDeJogos{ 
	private String nomeDoArquivo = "D:/Desktop/jogosSerializados2.bin"; 

	public void lerDoArquivoParaMemoria(ColecaoDeJogos listaDeJogos) { 
		try {
		    Jogo jogo = null; 
			ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(nomeDoArquivo)); 
			do {
				jogo = (Jogo) arquivo.readObject(); 
				if (jogo != null) 
				{
					listaDeJogos.adicionarJogo(jogo); 
				}
			} while (jogo != null); 
			arquivo.close(); 
		} catch (IOException e) {
			System.out.println(e.getMessage()); 
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()); 
		}
	}

	@Override
	public void escreverDaMemoriaNoArquivo(ColecaoDeJogos listaDeJogos, int tipo) {
		int indiceDoJogo = 0;
		ObjectOutputStream arquivoParaEscrita = null;
		try {
			arquivoParaEscrita =  new ObjectOutputStream(new FileOutputStream(nomeDoArquivo)); 
			for (; indiceDoJogo < listaDeJogos.obterTotalDeJogos(); indiceDoJogo++) {
				arquivoParaEscrita.writeObject(listaDeJogos.obterJogo(indiceDoJogo)); 
			}
			arquivoParaEscrita.close();
		} catch (IOException e) {
			System.out.println(e.getMessage()); 
		}
		
	}
}
