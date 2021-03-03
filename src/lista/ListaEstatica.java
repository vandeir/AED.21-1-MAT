package lista;

public class ListaEstatica {

	private int[] info;
	private int tamanho;
	
	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	private void redimensionar() {
		int[] novo = new int[tamanho+10];
		for (int i=0; i < info.length; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	public int buscar(int valor) {
		for (int i=0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	
	public void retirar(int valor) {
		int posicao = this.buscar(valor);
		if (posicao != -1) {
			for (int i = posicao; i < tamanho-1; i++) {
				info[i] = info[i+1];
			}
			tamanho--;
		}
	}
	
	public String toString() {
		String toString = "[";
		for (int i = 0; i < tamanho; ++i) {
			toString += info[i];
			if (i != tamanho-1) {
				toString += ", ";
			}
		}
		toString += "]";
		return toString;
	}
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	public ListaEstatica copiar() {
		ListaEstatica nova = new ListaEstatica();
		for (int i=0; i < tamanho; i++) {
			nova.inserir(info[i]);
		}
		return nova;
	}
	
	public void concatenar(ListaEstatica outra) {
		for (int i=0; i < outra.getTamanho(); i++) {
			this.inserir(outra.pegar(i));
		}
	}
	
	public ListaEstatica dividir() {
		ListaEstatica nova = new ListaEstatica();
		int qtde = tamanho/2;
		for (int i=qtde; i < tamanho; i++) {
			nova.inserir(info[i]);
		}
		tamanho = qtde;
		return nova;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int pegar(int posicao) {
		if (posicao >= tamanho) {  // posição inválida
			throw new ArrayIndexOutOfBoundsException("Posição inválida "+posicao);
		}
		return info[posicao];
	}
}
