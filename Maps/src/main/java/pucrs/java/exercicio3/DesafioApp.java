package pucrs.java.exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DesafioApp {

	public static void main(String[] args) {

		exercicioUnionList();

		System.out.println("-------------------------------");

		unionMaps();

		System.out.println("-------------------------------");

		intersectList();

		System.out.println("-------------------------------");

		intersectMap();

		System.out.println("-------------------------------");

		diffList();

		System.out.println("-------------------------------");
		
		diffMap();

	}

	private static void exercicioUnionList() {
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
		System.out.println(union(lista1, lista2));
		long endTime = System.nanoTime();

		System.out.println("Tempo de execução ArrayList: " + (endTime - startTime));
	}

	public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		ArrayList<Integer> resposta = new ArrayList<Integer>(l1);
		resposta.addAll(l2);
		for (int i = 0; i < resposta.size(); i++) {
			for (int j = i + 1; j < resposta.size(); j++) {
				if (resposta.get(i) == resposta.get(j)) {
					resposta.remove(j);
				}
				if (j > resposta.size()) {
					break;
				}
			}
		}
		return resposta;
	}

	private static void unionMaps() {
		Map<Integer, Integer> listaMap = new HashMap<Integer, Integer>();
		listaMap.put(1, 1);
		listaMap.put(2, 2);
		listaMap.put(3, 3);

		Map<Integer, Integer> listaMap2 = new HashMap<Integer, Integer>();
		listaMap2.put(4, 4);
		listaMap2.put(5, 5);
		listaMap2.put(6, 6);

		long startTimeMap = System.nanoTime();
		System.out.println("Método União Maps");
		System.out.println(unionMaps(listaMap, listaMap2));
		long endTimeMap = System.nanoTime();

		System.out.println("Tempo de execução Maps: " + (endTimeMap - startTimeMap));
	}

	public static Map<Integer, Integer> unionMaps(Map<Integer, Integer> l1, Map<Integer, Integer> l2) {
		Map<Integer, Integer> resposta = new HashMap<Integer, Integer>();
		resposta.putAll(l1);
		resposta.putAll(l2);
		return resposta;
	}

	private static void intersectList() {
		ArrayList<Integer> listaIntersect = new ArrayList<Integer>();
		listaIntersect.add(1);
		listaIntersect.add(2);
		listaIntersect.add(3);
		listaIntersect.add(4);
		ArrayList<Integer> listaIntersect2 = new ArrayList<Integer>();
		listaIntersect2.add(1);
		listaIntersect2.add(4);
		listaIntersect2.add(5);

		long startTimeIntersect = System.nanoTime();
		System.out.println("Método Intersecção ArrayList");
		System.out.println(intersect(listaIntersect, listaIntersect2));
		long endTimeIntersect = System.nanoTime();

		System.out.println("Tempo de execução ArrayList: " + (endTimeIntersect - startTimeIntersect));
	}

	public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		ArrayList<Integer> resposta = new ArrayList<Integer>();

		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l2.size(); j++) {
				if (l1.get(i) == l2.get(j)) {
					resposta.add(l2.get(j));
				}
				if (j > resposta.size()) {
					break;
				}
			}
		}
		return resposta;
	}

	private static void intersectMap() {
		Map<Integer, Integer> listaMap = new HashMap<Integer, Integer>();
		listaMap.put(1, 1);
		listaMap.put(2, 2);
		listaMap.put(3, 3);

		Map<Integer, Integer> listaMap2 = new HashMap<Integer, Integer>();
		listaMap2.put(1, 1);
		listaMap2.put(2, 2);
		listaMap2.put(6, 6);

		long startTimeMap = System.nanoTime();
		System.out.println("Método intersecção Maps");
		System.out.println(intersectMap(listaMap, listaMap2));
		long endTimeMap = System.nanoTime();

		System.out.println("Tempo de execução Maps: " + (endTimeMap - startTimeMap));
	}

	public static Map<Integer, Integer> intersectMap(Map<Integer, Integer> l1, Map<Integer, Integer> l2) {
		Map<Integer, Integer> resposta = new HashMap<Integer, Integer>(l1);
		resposta.keySet().retainAll(l2.keySet());
		return resposta;
	}

	private static void diffList() {
		ArrayList<Integer> listaDiff = new ArrayList<Integer>();
		listaDiff.add(1);
		listaDiff.add(2);
		listaDiff.add(3);
		listaDiff.add(4);
		listaDiff.add(4);
		
		ArrayList<Integer> listaDiff2 = new ArrayList<Integer>();
		listaDiff2.add(1);
		listaDiff2.add(4);
		listaDiff2.add(5);
		listaDiff2.add(6);
		
		long startTimeIntersect = System.nanoTime();
		System.out.println("Método Diff ArrayList");
		System.out.println(diff(listaDiff, listaDiff2));
		long endTimeIntersect = System.nanoTime();

		System.out.println("Tempo de execução ArrayList: " + (endTimeIntersect - startTimeIntersect));
	}

	public static ArrayList<Integer> diff(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		ArrayList<Integer> resposta = new ArrayList<Integer>();
		
		for(int i = 0; i < l1.size(); i++) {
			if(!l2.contains(l1.get(i))) {
				resposta.add(l1.get(i));
			}
		}
		for(int i = 0; i < l2.size(); i++) {
			if(!l1.contains(l2.get(i))) {
				resposta.add(l2.get(i));
			}
		}
		return resposta;
	}
	
	private static void diffMap() {
		Map<Integer, Integer> listaMap = new HashMap<Integer, Integer>();
		listaMap.put(1, 1);
		listaMap.put(2, 2);
		listaMap.put(3, 3);
		listaMap.put(4, 4);
		listaMap.put(4, 4);

		Map<Integer, Integer> listaMap2 = new HashMap<Integer, Integer>();
		listaMap2.put(1, 1);
		listaMap2.put(4, 4);
		listaMap2.put(5, 5);
		listaMap2.put(6, 6);

		long startTimeMap = System.nanoTime();
		System.out.println("Método diferença Maps");
		System.out.println(diffMap(listaMap, listaMap2));
		long endTimeMap = System.nanoTime();

		System.out.println("Tempo de execução Maps: " + (endTimeMap - startTimeMap));
	}
	
	public static  Map<Integer, Integer> diffMap(Map<Integer, Integer> l1, Map<Integer, Integer> l2) {
		Map<Integer, Integer> resposta = new HashMap<Integer,Integer>();

		for(Integer integer: l1.keySet()) {
			if(!l2.containsKey(l1.get(integer))){
				resposta.put(l1.get(integer),l1.get(integer));
			}
		}
		for(Integer integer: l2.keySet()) {
			if(!l1.containsKey(l2.get(integer))){
				resposta.put(l2.get(integer),l2.get(integer));
			}
		}
		return resposta;
	}
}
