package lista;

public class PilhaVetor<T> implements Pilha<T> {

	private T[] info;
	private int tamanho;
	private int limite;

	public PilhaVetor(int limite) {
		this.limite = limite;
		this.info = (T[]) new Object[this.limite];
		this.tamanho = 0;
	}

	@Override
	public void push(T valor) {
		if (tamanho == limite)
			throw new RuntimeException("Limite atingido. Pilha cheia.");

		info[tamanho] = valor;
		tamanho++;
	}

	@Override
	public T pop() {
		T valor = this.peek();
		tamanho--;
		info[tamanho] = null;
		return valor;
	}

	@Override
	public T peek() {
		if (this.estaVazia()) {
			throw new RuntimeException("Pilha está vazia");
		}
		return info[tamanho - 1];
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public void liberar() {
		info = (T[]) new Object[this.limite];
		tamanho = 0;
	}

	public String toString() {
		String str = "[Topo ";
		for (int i = tamanho - 1; i >= 0; i--) {
			str += info[i] + ", ";
		}
		return str + "base]";
	}

	private boolean compararElementos(PilhaVetor<T> p2) {
		boolean encontrado = false;
		int contador = 0;
		for (int i = 0; i < this.tamanho; i++) {
			if (!info[i].equals(p2.get(i))) {
				return false;
			}
		}
		return true;
	}

	private T get(int posicao) {
		return this.info[posicao];
	}
	private int getTamanho() {
		return this.tamanho;
	}

	public int comparar(PilhaVetor<T> p2) {
		if (this.tamanho < p2.getTamanho()) {  // menor
			return -1;
		}
		if (this.tamanho == p2.getTamanho()) {  // mesmo tamanho
			if (this.compararElementos(p2))
				return 0;
			else
				return 1;
		} else {   // maior
			return 1;
		}

		/*
		if (this.tamanho == p2.tamanho && this.compararElementos(p2)) {
			return 0;
		} else if (this.tamanho < p2.tamanho) {
			return -1;
		} else if ((this.tamanho > p2.tamanho) || !this.compararElementos(p2)) {
			return 1;
		}
		// nunca chegue aqui
		return 2;
		*/
	}
}
