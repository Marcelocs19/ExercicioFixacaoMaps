package pucrs.java.exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		System.out.println("-------------------------------");
		
		Map<Integer,Integer> listaMap = new HashMap<Integer,Integer>();
		listaMap.put(1, 1);
		listaMap.put(2, 2);
		listaMap.put(3, 3);
		
		Map<Integer,Integer> listaMap2 = new HashMap<Integer,Integer>();
		listaMap2.put(4, 4);
		listaMap2.put(5, 5);
		listaMap2.put(6, 6);
		
		long startTimeMap = System.nanoTime();
		System.out.println("Método União");
		System.out.println(unionMaps(listaMap,listaMap2));
		long endTimeMap = System.nanoTime();
		
		System.out.println("Tempo de execução ArrayList: " + (endTimeMap - startTimeMap));
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

	public static Map<Integer, Integer> unionMaps(Map<Integer, Integer> l1, Map<Integer, Integer> l2){
		Map<Integer, Integer> resposta = new HashMap<Integer, Integer>();
		resposta.putAll(l1);
		resposta.putAll(l2);
		return resposta;
	}
}
