package pilhas;


public class No <TIPO_GENERICO>{
	public TIPO_GENERICO dado;
	public No<TIPO_GENERICO> proximo;
	
	public No(TIPO_GENERICO dado) {
		this.dado =  dado;
		this.proximo = null;
	}
	
	
}

