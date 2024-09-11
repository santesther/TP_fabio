package pilhas;

public interface Pilha <TIPO_GENERICO>{
	
	void adicionarElemento(TIPO_GENERICO dado);
	
	public TIPO_GENERICO excluirElemento();
	
	public TIPO_GENERICO obterPrimeiroElemento();
	
	public boolean verificarSeEstaVazia();
	
	@Override
	public String toString();

	public void push(TIPO_GENERICO dado);

}
