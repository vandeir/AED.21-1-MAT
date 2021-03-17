package lista;

public class ListaEncadeada implements Lista {
	private NoLista primeiro;
	private NoLista ultimo;
	private int qtdeElementos;

	@Override
	public void inserir(int valor) {
		NoLista novo = new NoLista();
		novo.setInfo(valor);
		qtdeElementos++;
		// para inserção no final (a lista fica de acordo com a ordem de inserção)
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProximo(novo);
		}
		ultimo = novo;
		/*
		 * para inserção no início (a lista fica ao contrário)
		 * novo.setProximo(this.primeiro); this.primeiro = novo;
		 */
	}

	public String toString() {
		String toString = "[";
		NoLista p = this.primeiro;
		while (p != null) {
			toString += p.getInfo() + ", ";
			p = p.getProximo();
		}
		toString += "]";
		return toString;
	}

	@Override
	public int buscar(int valor) {
		NoLista p = this.primeiro;
		int posicao = 0;
		while (p != null) {
			if (p.getInfo() == valor) {
				return posicao;
			}
			posicao++;
			p = p.getProximo();
		}
		return -1;
	}

	@Override
	public void retirar(int valor) {
		NoLista anterior = null;
		NoLista p = this.primeiro;

		while (p != null && p.getInfo() != valor) {
			anterior = p;
			p = p.getProximo();
		}
		if (p != null) {
			if (anterior == null) {
				this.primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
			this.qtdeElementos--;
		}
	}

	@Override
	public boolean estaVazia() {
		return (primeiro == null); // (ultimo == null) ou (qtdeElementos == 0)
	}

	@Override
	public Lista copiar() {
		ListaEncadeada nova = new ListaEncadeada();
		NoLista p = this.primeiro;
		while (p != null) {
			nova.inserir(p.getInfo());
			p = p.getProximo();
		}
		return nova;
	}

	@Override
	public void concatenar(Lista outra) {
		for (int i = 0; i < outra.getTamanho(); i++) {
			this.inserir(outra.pegar(i));
		}
	}

	@Override
	public Lista dividir1() {
		ListaEncadeada nova = new ListaEncadeada();

		int qtde = this.getTamanho() / 2;

		int qtdeCopiados = 0;
		int[] copiados = new int[this.getTamanho()];

		for (int i = qtde; i < this.getTamanho(); i++) {
			nova.inserir(this.pegar(i));
			copiados[qtdeCopiados] = this.pegar(i);
			qtdeCopiados++;
		}

		for (int j = 0; j < qtdeCopiados; j++) {
			this.retirar(copiados[j]);
		}

		return nova;
	}

	@Override
	public Lista dividir() {
		ListaEncadeada nova = new ListaEncadeada();
		int qtde = this.getTamanho() / 2;
		NoLista nl = this.primeiro;
		NoLista anterior=null;
		int index = 0;
		while (index < qtde) {
			anterior = nl;
			nl = nl.getProximo();
			index++;
		}

		// atualizando a nova lista
		nova.primeiro = nl;
		nova.ultimo = this.ultimo;
		nova.qtdeElementos = this.qtdeElementos - qtde;
		
		// atualizando a lista atual
		this.ultimo = anterior;
		ultimo.setProximo(null);
		this.qtdeElementos = qtde;
		
		return nova;
	}

	@Override
	public int getTamanho() {
		return this.qtdeElementos;
	}

	@Override
	public int pegar(int posicao) {
		if (posicao >= this.qtdeElementos) { // posição inválida
			throw new ArrayIndexOutOfBoundsException("Posição inválida " + posicao);
		}
		NoLista p = this.primeiro;
		int contPosicao = 0;
		while (p != null) {
			if (contPosicao == posicao) {
				return p.getInfo();
			}
			contPosicao++;
			p = p.getProximo();
		}
		// pela lógica nunca deve chegar aqui
		return Integer.MIN_VALUE;
	}

}
