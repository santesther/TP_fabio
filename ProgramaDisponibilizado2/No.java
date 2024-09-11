package ProgramaDisponibilizado2;

public class No {
	public No proximo;
    public Jogo dado;
	
	public No(Jogo jogo) {
		this.dado =  jogo;
		this.proximo = null;
	}
}
