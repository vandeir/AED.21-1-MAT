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
}
