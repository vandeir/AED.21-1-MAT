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
	
	
}
