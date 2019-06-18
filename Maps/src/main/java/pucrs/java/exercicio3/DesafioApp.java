package pucrs.java.exercicio3;

import java.util.ArrayList;

public class DesafioApp {

	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(4);
		lista2.add(5);
		lista2.add(6);
		
		long startTime = System.nanoTime();
		System.out.println("Método União");
		System.out.println(union(lista1,lista2));
		long endTime = System.nanoTime();
		
		System.out.println("Tempo de execução ArrayList: " + (endTime - startTime));
	}

	public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2){
		ArrayList<Integer> resposta = new ArrayList<Integer>(l1);
		resposta.addAll(l2);
		for(int i = 0; i < resposta.size(); i++) {
			for(int j = i + 1; j < resposta.size(); j++) {
				if(resposta.get(i) == resposta.get(j)) {
					resposta.remove(j);
				}
				if(j > resposta.size()) {
					break;
				}
			}
		}		
		return resposta;
	}
	
}
