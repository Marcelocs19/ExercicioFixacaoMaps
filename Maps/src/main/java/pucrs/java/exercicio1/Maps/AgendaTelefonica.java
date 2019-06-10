package pucrs.java.exercicio1.Maps;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

	private Map<String, String> agendaTelefonica = new HashMap<String,String>(); 	
	
	public AgendaTelefonica() {
		
	}
	
	public void inserir(String nome, String numero) {
		agendaTelefonica.put(nome, numero);
	}
	
	public String buscarNumero(String nome) {		
		return agendaTelefonica.get(nome);
	}
	
	public void remover(String nome) {
		agendaTelefonica.remove(nome);
	}
	
	public int tamanho() {
		return agendaTelefonica.size();
	}
}