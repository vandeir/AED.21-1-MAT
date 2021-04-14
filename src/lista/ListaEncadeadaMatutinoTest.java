package lista;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEncadeadaMatutinoTest {

	@Test
	void testultimoIndiceDeDe_01() {
		// L; M; A; B; M; N; O; P; P
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		lista.inserir("L"); 
		lista.inserir("M");
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("M");
		lista.inserir("N");
		lista.inserir("O");
		lista.inserir("P");
		lista.inserir("P");
		assertEquals(4, lista.ultimoIndiceDe("M"));
		assertEquals("[L, M, A, B, M, N, O, P, P, ]",lista.toString());
	}

	@Test
	void testultimoIndiceDeDe_02() {
		// L; M; A; B; M; N; O; P; P
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		lista.inserir("L"); 
		lista.inserir("M");
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("M");
		lista.inserir("N");
		lista.inserir("O");
		lista.inserir("P");
		lista.inserir("P");
		assertEquals(8, lista.ultimoIndiceDe("P"));
	}
	
	@Test
	void testultimoIndiceDeDe_03() {
		// L; M; A; B; M; N; O; P; P
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		lista.inserir("L"); 
		lista.inserir("M");
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("M");
		lista.inserir("N");
		lista.inserir("O");
		lista.inserir("P");
		lista.inserir("P");
		assertEquals(-1, lista.ultimoIndiceDe("MM"));
	}
	
	@Test
	void testultimoIndiceDeDe_04() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);

		assertEquals(0, lista.ultimoIndiceDe(30));
	}
	
	@Test
	void testultimoIndiceDeDe_05() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		
		assertEquals(-1, lista.ultimoIndiceDe(30));
	}
	
	@Test
	void testIntercala_01() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);
		ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
		lista2.inserir(25); 
		lista2.inserir(15);
		lista2.inserir(5);
		assertEquals("[30, 25, 20, 15, 10, 5, ]",lista.intercala(lista2).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
		assertEquals("[25, 15, 5, ]",lista2.toString());
	}
	
	@Test
	void testIntercala_02() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);
		ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
		lista2.inserir(25); 
		lista2.inserir(15);
		lista2.inserir(5);
		assertEquals("[25, 30, 15, 20, 5, 10, ]",lista2.intercala(lista).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
		assertEquals("[25, 15, 5, ]",lista2.toString());
	}
	
	@Test
	void testIntercala_03() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);

		assertEquals("[30, 30, 20, 20, 10, 10, ]",lista.intercala(lista).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
	}
	
	@Test
	void testIntercala_04() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);
		ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
		lista2.inserir(25); 
		lista2.inserir(15);
		lista2.inserir(5);
		lista2.inserir(4);
		lista2.inserir(3);
		assertEquals("[30, 25, 20, 15, 10, 5, 4, 3, ]",lista.intercala(lista2).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
		assertEquals("[25, 15, 5, 4, 3, ]",lista2.toString());
	}
	
	@Test
	void testIntercala_05() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);
		ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
		lista2.inserir(25); 
		lista2.inserir(15);
		lista2.inserir(5);
		lista2.inserir(4);
		lista2.inserir(3);
		assertEquals("[25, 30, 15, 20, 5, 10, 4, 3, ]",lista2.intercala(lista).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
		assertEquals("[25, 15, 5, 4, 3, ]",lista2.toString());
	}
	
	@Test
	void testIntercala_06() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);
		ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();

		assertEquals("[30, 20, 10, ]",lista.intercala(lista2).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
		assertEquals("[]",lista2.toString());
	}
	
	@Test
	void testIntercala_07() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.inserir(30); 
		lista.inserir(20);
		lista.inserir(10);
		ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();

		assertEquals("[30, 20, 10, ]",lista2.intercala(lista).toString());
		assertEquals("[30, 20, 10, ]",lista.toString());
		assertEquals("[]",lista2.toString());
	}
}
