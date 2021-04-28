package arvore;

public class NoArvoreBST<T extends Comparable> extends NoArvoreBinaria<T> {

	public NoArvoreBST(T info) {
		super(info);
	}

	public NoArvoreBST<T> buscar(T procurado) {
		if (procurado.equals(this.getInfo())) {
			return this;
		} else {
			if (procurado.compareTo(this.getInfo()) < 0) {
				return ((NoArvoreBST<T>)this.getEsq()).buscar(procurado);
			} else {
				return ((NoArvoreBST<T>)this.getDir()).buscar(procurado);
			}
		}
	}
}
