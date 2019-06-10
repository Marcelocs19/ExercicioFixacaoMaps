package pucrs.java.exercicio1.Maps;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


	/**
	 * Testando a Busca
	 * na Agenda Telefonica
	 */	
	@Test
	public void testSearch() {
		AgendaTelefonica ag = new AgendaTelefonica();
		ag.inserir("Marcelo", "982210118");
		assertEquals("982210118",ag.buscarNumero("Marcelo"));
	}
	
	
}
