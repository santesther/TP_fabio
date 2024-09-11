package pilhas;

public class PilhaEncadeada <TIPO_GENERICO> implements Pilha <TIPO_GENERICO>{

	No<TIPO_GENERICO> topo = null;
	
	@Override
	public void adicionarElemento(TIPO_GENERICO dado) 
	{
		No<TIPO_GENERICO> novoNo = new No<TIPO_GENERICO>(dado); 
		novoNo.proximo = this.topo;
		this.topo = novoNo;
	}
	
	@Override
	public TIPO_GENERICO excluirElemento() 
	{
		TIPO_GENERICO dado = this.topo.dado;
		this.topo = this.topo.proximo;
		return dado;
	}
	
	@Override
	public String toString() 
	{
		String elementos = new String();
		No<TIPO_GENERICO> noAtual = this.topo;
		while (noAtual != null) 
		{
			elementos = elementos + noAtual.dado + " "; 
			noAtual = noAtual.proximo;
		}
		return "ListaEncadeada [ "+ elementos + "]";
	}

	@Override
	public TIPO_GENERICO obterPrimeiroElemento() 
	{
		return this.topo.dado;
	}

	@Override
	public boolean verificarSeEstaVazia() 
	{
		return this.topo == null;
	}
	
	public Iterador<TIPO_GENERICO> obterIterador() 
	{
		Iterador<TIPO_GENERICO> iterador = new Iterador<>(this.topo);
		return iterador;
	}	
		
	public void push(TIPO_GENERICO dado) 
	{
		No<TIPO_GENERICO> novoNo = new No<TIPO_GENERICO>(dado); 
		novoNo.proximo = this.topo;
		this.topo = novoNo;
	}
}
