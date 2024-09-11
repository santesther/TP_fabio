package projeto_fabio;


import java.util.ArrayList;

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
		if (this.listaDeJogos.size() > 0) {
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
	
	public void ordenarAno(Jogo[] listaDeJogos){

	}

	public void ordenarVendas(){
		
	}

	public Jogo[] retornarVetor(){
		return null;
	}

	@Override
	public void ordenarVendas(Jogo[] listaDeJogos) {
		
	}
}
