package ProgramaDisponibilizado2;


public class listaEncadeada implements ColecaoDeJogos{
    No inicio = null;
	No proximo;
    Jogo listaDeJogos[];
	int totalDeJogos;
    

	@Override
	public void adicionarJogo(Jogo jogo) 
	{
		No novoNo = new No(jogo); 
		novoNo.proximo = this.inicio;
		this.inicio = novoNo;
		totalDeJogos++;
	}

	@Override
	public boolean excluirJogo() 
	{
		if (this.inicio != null) 
		{
			this.inicio = this.inicio.proximo;
			return true;
		}
		return false;
	}

	@Override
	public Jogo obterJogo(int indiceDoJogo) 
	{
		No noAtual = this.inicio, noAnterior;
		int posicaoAtual = 0;
		while (noAtual != null) {
			if (indiceDoJogo != posicaoAtual) 
			{
				noAnterior = noAtual;
				noAtual = noAtual.proximo;
				posicaoAtual++;
			} else 
			{
				return noAtual.dado;
			}
		}
		return null;
	}

	@Override
	public int obterTotalDeJogos() 
	{
		return totalDeJogos;
	}

	@Override
	public Jogo buscarJogoPorNome(metodosDeBusca tipoBusca) 
	{
		String jogoB = "";
		Iterador iteradorListaEncadeada = obterIterador();
		while (iteradorListaEncadeada.temProximo()) {
			Jogo jogo = iteradorListaEncadeada.obterElemento();
			if (jogo.obterNome().equals(jogoB)) 
			{
				return jogo;
			}
		}
		return null;
	}

	

	@Override
	public Iterador obterIterador() 
	{
		Iterador iterador = new Iterador(this.inicio);
		return iterador;
	}

	@Override
	public String toString() 
	{
		String elementos = new String();
		No noAtual = this.inicio;
		while (noAtual != null) 
		{
			elementos = elementos + noAtual.dado.obterNome() + "\n " + noAtual.dado.obterAno() + "\n "
					+ noAtual.dado.obterPlataforma() + "\n " + noAtual.dado.obterVendasGlobais();
			noAtual = noAtual.proximo;
		}
		return "ListaEncadeada [ " + elementos + "]";
	}

	@Override
	public void ordenarJogosPorAno() 
	{
		boolean existiuTroca = true;
		No no = this.inicio;

		if (totalDeJogos > 0) 
		{
			do {
				existiuTroca = false;
				for (no = inicio; no != null; no = no.proximo) 
				{
					if (no.proximo != null) 
					{
						if (no.dado.obterAno() > no.proximo.dado.obterAno()) 
						{
							trocarValores(no, no.proximo);
							existiuTroca = true;
						}
					}
				}
			} while (existiuTroca);
		}
		System.out.println("Jogos ordenados por ano");

	}

	@Override
	public void ordenarJogosPorVendasGlobais() 
	{
		boolean existiuTroca = true;
		No no;
		if (totalDeJogos > 0) 
		{
			do {
				existiuTroca = false;
				for (no = inicio; no != null; no = no.proximo) 
				{
					if (no.proximo != null) {
						if (no.dado.obterVendasGlobais() > no.proximo.dado.obterVendasGlobais()) 
						{
							trocarValores(no, no.proximo);
							existiuTroca = true;
						}
					}
				}
			} while (existiuTroca);
		}
		System.out.println("jogos ordenados por vendas globais");
	}

	private void trocarValores(No noAnterior, No noAtual) 
	{
		Jogo armazenamentoAuxiliar = null;
		armazenamentoAuxiliar = noAnterior.dado;
		noAnterior.dado = (noAtual.dado);
		noAtual.dado = (armazenamentoAuxiliar);

	}

	@Override
	public void setJogo(int i, Jogo auxiliarTrocaJogo) {
		// TODO Auto-generated method stub
		
	}
    
}
