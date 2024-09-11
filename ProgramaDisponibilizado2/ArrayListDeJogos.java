package ProgramaDisponibilizado2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDeJogos implements ColecaoDeJogos{
	ArrayList <Jogo> listaDeJogos;

	public ArrayListDeJogos() {
		this.listaDeJogos = new ArrayList<Jogo>();
	}
	
	@Override
	public void adicionarJogo(Jogo jogo) {
		this.listaDeJogos.add(jogo);
	}
	
	@Override
	public boolean excluirJogo() {
		if (this.listaDeJogos.size() > 0) 
		{
			int ultimoJogoDaLista = this.listaDeJogos.size() - 1;
			this.listaDeJogos.remove(ultimoJogoDaLista);
			return true;
		}
		return false;
	}
	
	@Override
	public Jogo obterJogo(int indiceDoJogo) {
		return this.listaDeJogos.get(indiceDoJogo);
	}
	
	@Override
	public int obterTotalDeJogos() {
		return this.listaDeJogos.size();
	}
	
	public void ordenarJogosPorAno(){
		boolean existiuTroca = true;
		int totalDeJogos = this.listaDeJogos.size();
		if (totalDeJogos > 0) 
		{
			do {
				existiuTroca = false;
				for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos ; indiceDoJogo++) 
				{
					if (indiceDoJogo + 1 < totalDeJogos) 
					{
						if (listaDeJogos.get(indiceDoJogo).obterAno() > listaDeJogos.get(indiceDoJogo + 1).obterAno()) 
						{
							Jogo auxiliarTrocaJogo = this.listaDeJogos.get(indiceDoJogo);
							this.listaDeJogos.set(indiceDoJogo, this.listaDeJogos.get(indiceDoJogo + 1)); 
							this.listaDeJogos.set(indiceDoJogo + 1, auxiliarTrocaJogo); 
							existiuTroca = true;
						}
					}
				}
			} while (existiuTroca);
		}
		System.out.println("Jogos ordenados por ano");
	}

	public void ordenarJogosPorVendasGlobais(){
		boolean existiuTroca = true;
		int totalDeJogos = this.listaDeJogos.size();
		
		if (totalDeJogos > 0) 
		{
			do {
				existiuTroca = false;
				for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) 
				{
					if (indiceDoJogo + 1 < totalDeJogos) 
					{
						if (listaDeJogos.get((indiceDoJogo)).obterVendasGlobais() > listaDeJogos.get((indiceDoJogo + 1)).obterVendasGlobais()) 
						{
							Jogo auxiliarTrocaJogo = this.listaDeJogos.get(indiceDoJogo);
							this.listaDeJogos.set(indiceDoJogo, this.listaDeJogos.get(indiceDoJogo + 1));
							this.listaDeJogos.set(indiceDoJogo + 1, auxiliarTrocaJogo);
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
		Scanner entradaDoTeclado = new Scanner(System.in);
		System.out.println("Digite o nome do jogo que você deseja encontrar");
		String jogoABuscar = entradaDoTeclado.nextLine();
		int totalDeJogos = this.listaDeJogos.size();

		for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) 
		{
			if (jogoABuscar.equals(listaDeJogos.get(indiceDoJogo).obterNome())) 
			{
				return listaDeJogos.get(indiceDoJogo);
			}
		}
		return null;
	}

	@Override
	public void setJogo(int i, Jogo auxiliarTrocaJogo)
	 {
		int indiceDoJogo = 0;
		auxiliarTrocaJogo = this.listaDeJogos.get(indiceDoJogo);
		this.listaDeJogos.set(indiceDoJogo, this.listaDeJogos.get(indiceDoJogo + 1)); 
		this.listaDeJogos.set(indiceDoJogo + 1, auxiliarTrocaJogo); 
		
	}

	@Override
	public Iterador obterIterador() {
		// TODO Auto-generated method stub
		return null;
	}
}

