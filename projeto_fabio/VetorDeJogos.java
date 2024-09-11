package projeto_fabio;


public class VetorDeJogos implements ColecaoDeJogos{
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
		if (this.totalDeJogos > 0) {
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

	public Jogo[] retornarVetor(){
		return this.listaDeJogos;
	}

	@Override
	public  void ordenarAno(Jogo[] listaDeJogos) {
		boolean existiuTroca = false;

		do {
		for (int indiceDoJogo = 0; indiceDoJogo < this.totalDeJogos; indiceDoJogo++){
			if (indiceDoJogo + 1 < this.totalDeJogos){
			if (listaDeJogos[indiceDoJogo].obterAno() > listaDeJogos[indiceDoJogo + 1].obterAno()) {
				existiuTroca = true;
			if (existiuTroca == true)
			{
					Jogo armazenamentoAuxiliar;
					armazenamentoAuxiliar = listaDeJogos[indiceDoJogo];
		            listaDeJogos[indiceDoJogo] = listaDeJogos[indiceDoJogo + 1];
		            listaDeJogos[indiceDoJogo + 1] = armazenamentoAuxiliar;
			} 
		}
	}
}
		}while (existiuTroca);
	} 

	
	public void ordenarVendas(Jogo[] listaDeJogos){
		boolean existiuTroca = false;

		do {
		for (int indiceDoJogo = 0; indiceDoJogo < this.totalDeJogos; indiceDoJogo++){
			if (indiceDoJogo + 1 < this.totalDeJogos){
			if (listaDeJogos[indiceDoJogo].obterVendasGlobais() > listaDeJogos[indiceDoJogo + 1].obterVendasGlobais()) {
				existiuTroca = true;
				if (existiuTroca == true)
				{
					Jogo armazenamentoAuxiliar;
					armazenamentoAuxiliar = listaDeJogos[indiceDoJogo];
		            listaDeJogos[indiceDoJogo] = listaDeJogos[indiceDoJogo + 1];
		            listaDeJogos[indiceDoJogo + 1] = armazenamentoAuxiliar;		
				}	
			} 
		}
	}
		}while (existiuTroca);
	} 
}

