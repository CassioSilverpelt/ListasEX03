package view;

import model.Lista;
import controller.IntersecListasController;

public class IntersecListasPrincipal {

	public static void main (String[] args) {
		
		IntersecListasController listCon = new IntersecListasController();
		
		Lista<Integer> listaA = new Lista<>();
		Lista<Integer> listaB = new Lista<>();
		Lista<Integer> listaI = new Lista<>();
		Lista<Integer> listaU = new Lista<>();
		
		listaA.addLast(3);
		listaA.addLast(5);
		listaA.addLast(8);
		listaA.addLast(12);
		listaA.addLast(9);
		listaA.addLast(7);
		listaA.addLast(16);
		
		listaB.addLast(9);
		listaB.addLast(6);
		listaB.addLast(2);
		listaB.addLast(3);
		listaB.addLast(7);
		
		listCon.unirListas(listaA, listaB, listaU);
		listCon.intersecListas(listaA, listaB, listaI);
		
		System.out.println("Lista união: \n");
		listCon.imprimeLista(listaU);
		System.out.println("\nLista intersecção: \n");
		listCon.imprimeLista(listaI);
		
	}

}
