package pilhas;

public class Iterador <TIPO_GENERICO>{

	No<TIPO_GENERICO> noAtual; 
	
	public Iterador(No<TIPO_GENERICO> no) {
		this.noAtual = no;
	}
	
	public boolean temProximo() {
		if (this.noAtual != null) {
			return true;
		}
		return false;
	}
	
	public TIPO_GENERICO obterElemento() {
		No<TIPO_GENERICO> auxiliar = this.noAtual;
		this.noAtual = this.noAtual.proximo;
		return auxiliar.dado;
	}
}