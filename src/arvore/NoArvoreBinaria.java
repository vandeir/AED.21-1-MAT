package arvore;

public class NoArvoreBinaria<T> {
	private T info;
	private NoArvoreBinaria<T> esq;
	private NoArvoreBinaria<T> dir;

	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
		super();
		this.info = info;
		this.esq = esq;
		this.dir = dir;
	}

	public NoArvoreBinaria(T info) {
		super();
		this.info = info;
	}

	public String imprimePre() {
		String str = "<" + this.info; // trata raiz
		if (this.esq != null) {
			str += this.esq.imprimePre(); // percorre sae
		} else {
			str += "<>"; // subárvore vazia
		}
		if (this.dir != null) {
			str += this.dir.imprimePre(); // percorre sad
		} else {
			str += "<>"; // subárvore vazia
		}
		return str + ">";
	}

	public NoArvoreBinaria<T> pertence(T procurado) {
		if (this.info.equals(procurado)) { // tratar a raiz  
			return this;
		}
		NoArvoreBinaria<T> nabProcurado = null;
		if (this.esq != null) {
			nabProcurado = this.esq.pertence(procurado); // percorre a sae
		}
		if (nabProcurado == null) { // não encontrou na sae
			if (this.dir != null) {
				return this.dir.pertence(procurado); // percorre a sad
			}
		}
		return nabProcurado;
	}

	@Override
	public String toString() {
		return  this.info.toString() ;
	}

	
}
