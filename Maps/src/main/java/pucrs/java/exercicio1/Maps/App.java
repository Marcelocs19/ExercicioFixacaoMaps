package pucrs.java.exercicio1.Maps;

public class App {

	public static void main(String[] args) {
		AgendaTelefonica ag = new AgendaTelefonica();
		ag.inserir("Marcelo", "1111");
		ag.inserir("Maria", "2222");
		ag.inserir("Paulo", "3333");
		ag.inserir("Orisa", "4444");
		ag.inserir("Lucio", "5555");

		System.out.println("Busca Telefone: " + ag.buscarNumero("Orisa"));
		System.out.println("Tamanho da Agenda: " + ag.tamanho());
	}

}
