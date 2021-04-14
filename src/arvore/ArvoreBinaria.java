package arvore;

public class ArvoreBinaria<T> {
	private NoArvoreBinaria<T> raiz;

	public ArvoreBinaria() {
		super();
	}
	
	public void setRaiz(NoArvoreBinaria<T> r) {
		this.raiz = r;
	}
	
	public boolean vazia() {
		return (raiz == null);
	}
	
	public NoArvoreBinaria<T> pertence(T procurado){
		if (this.vazia()) {
			return null;
		}
		return raiz.pertence(procurado);
	}
	
	@Override
	public String toString() {
		if (this.vazia()) {
			return "<>";
		}
		return raiz.imprimePre();
	}
}
