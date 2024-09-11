package ProgramaDisponibilizado2;

public interface ColecaoDeJogos {
		
    public void adicionarJogo(Jogo jogo);
    
    public boolean excluirJogo();
    
    public Jogo obterJogo(int indiceDoJogo);
    
    public int obterTotalDeJogos();

    public void ordenarJogosPorAno();

    public void ordenarJogosPorVendasGlobais();

    public Jogo buscarJogoPorNome(metodosDeBusca tipoDeBusca);

    public void setJogo(int i, Jogo auxiliarTrocaJogo);

    public Iterador obterIterador();
    
}
