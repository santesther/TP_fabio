package projeto_fabio;


public interface ColecaoDeJogos {
		
    public void adicionarJogo(Jogo jogo);
    
    public boolean excluirJogo();
    
    public Jogo obterJogo(int indiceDoJogo);
    
    public int obterTotalDeJogos();

    public void ordenarAno(Jogo[] listaDeJogos);

    public void ordenarVendas(Jogo[] listaDeJogos);

    public Jogo[] retornarVetor();
}

