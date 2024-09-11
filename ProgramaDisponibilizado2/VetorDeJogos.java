package ProgramaDisponibilizado2;

import java.util.Scanner;


public class VetorDeJogos implements ColecaoDeJogos {
	Jogo listaDeJogos[];
	int totalDeJogos;

	public VetorDeJogos() {
		this.listaDeJogos = new Jogo[17000];
		this.totalDeJogos = 0;
	}

	public VetorDeJogos(int tamanhoMaximoDaLista) {
		this.listaDeJogos = new Jogo[tamanhoMaximoDaLista];
		this.totalDeJogos = 0;
	}

	@Override
	public void adicionarJogo(Jogo jogo) {
		this.listaDeJogos[totalDeJogos] = jogo;
		this.totalDeJogos++;
	}

	@Override
	public boolean excluirJogo() {
		if (this.totalDeJogos > 0) 
		{
			this.totalDeJogos--;
			return true;
		}
		return false;
	}

	@Override
	public Jogo obterJogo(int indiceDoJogo) {
		return this.listaDeJogos[indiceDoJogo];
	}

	@Override
	public int obterTotalDeJogos() {
		return this.totalDeJogos;
	}

	@Override
	public void ordenarJogosPorAno() {
		//metodoDeOrdenacao.ordenar(this.listaDeJogos);
		boolean existiuTroca = true;

		if (totalDeJogos > 0) 
		{
			do {
				existiuTroca = false;
				for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) 
				{
					if (indiceDoJogo + 1 < totalDeJogos) 
					{
						if (listaDeJogos[indiceDoJogo].obterAno() > listaDeJogos[indiceDoJogo + 1].obterAno()) 
						{
							Jogo auxiliarTrocaJogo;
							auxiliarTrocaJogo = this.listaDeJogos[indiceDoJogo];
							listaDeJogos[indiceDoJogo] = this.listaDeJogos[indiceDoJogo + 1];
							this.listaDeJogos[indiceDoJogo + 1] = auxiliarTrocaJogo;
							existiuTroca = true;
						}
					}
				}
			} while (existiuTroca);
		}
		System.out.println("jogos ordenados por ano");
	}

	@Override
	public void ordenarJogosPorVendasGlobais() {
		boolean existiuTroca = true;
		if (totalDeJogos > 0) 
		{
			do 
			{
				existiuTroca = false;
				for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) 
				{
					if (indiceDoJogo + 1 < totalDeJogos) 
					{
						if (listaDeJogos[indiceDoJogo].obterVendasGlobais() > listaDeJogos[indiceDoJogo + 1].obterVendasGlobais()) 
						{
							Jogo auxiliarTrocaJogo;
							auxiliarTrocaJogo = this.listaDeJogos[indiceDoJogo];
							listaDeJogos[indiceDoJogo] = this.listaDeJogos[indiceDoJogo + 1];
							this.listaDeJogos[indiceDoJogo + 1] = auxiliarTrocaJogo;
							existiuTroca = true;
						}
					}
				}
			} while (existiuTroca);
		}
		System.out.println("Jogos ordenados por vendas globais");
	}

	@Override
	public Jogo buscarJogoPorNome(metodosDeBusca tipoDeBusca) {
		int indice;
		indice = tipoDeBusca.buscarNomeNoVetor(listaDeJogos, totalDeJogos);
		return listaDeJogos[indice];
	}

	@Override
	public void setJogo(int i, Jogo auxiliarTrocaJogo) {
		int indiceDoJogo = 0;
		auxiliarTrocaJogo = this.listaDeJogos[indiceDoJogo];
		this.listaDeJogos[indiceDoJogo] = listaDeJogos[indiceDoJogo+1];
		this.listaDeJogos[indiceDoJogo+1] = auxiliarTrocaJogo;
	}

	@Override
	public Iterador obterIterador() {
		// TODO Auto-generated method stub
		return null;
	}

}
