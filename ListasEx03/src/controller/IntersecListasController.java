package controller;

import model.Lista;

public class IntersecListasController {

	public IntersecListasController() {
		super();
	}

	public void unirListas(Lista<Integer> listaA, Lista<Integer> listaB, Lista<Integer> listaU) {
		int tamanhoA = listaA.size();
		int tamanhoB = listaB.size();
		
		for (int i = 0; i < tamanhoA; i++) {
			try {
				listaU.addLast(listaA.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		for (int i = 0; i < tamanhoB; i++) {
			boolean achou = false;
			for (int j = 0; j < tamanhoA; j++) {
				try {
					if (listaU.get(j) == listaB.get(i)) {
						achou = true;
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
			if (!achou) {
				try {
					listaU.addLast(listaB.get(i));
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

	public void intersecListas(Lista<Integer> listaA, Lista<Integer> listaB, Lista<Integer> listaI) {
		int tamanhoA = listaA.size();
		int tamanhoB = listaB.size();
		
		for (int i = 0; i < tamanhoA; i++) {
			for (int j = 0; j < tamanhoB; j++) {
				try {
					if (listaA.get(i) == listaB.get(j)) {
						listaI.addLast(listaA.get(i));
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	public void imprimeLista(Lista<Integer> lista) {
		int tamanho = lista.size();
		
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println(lista.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
