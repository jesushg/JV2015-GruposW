/**
 *  Proyecto: Juego de la vida.
 *  Comprueba todos los métodos de la clase Nif.java 
 *  @since: prototipo2.1
 *  @source: nifTest.java  
 *  @author: Ana María Martínez Prats- @author daw15-29
 */
package modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Nif;

public class NifTest {
	private Nif nif1;
	private Nif nif2;
	private Nif nif3;

	@Before
	public void crearObjetosPrueba(){
		nif1 = new Nif();
		nif2 = new Nif("12345678A");
		nif3 = new Nif(nif2);
	}
	
	@After 
	public void borrarObjetosPrueba(){
		nif1 = null;
		nif2 = null;
		nif3 = null;
	}
	
	@Test
	public void testNifString() {
		assertTrue(nif2 != null);
	}

	@Test
	public void testNif() {
		assertTrue(nif1 != null);
	}

	@Test
	public void testNifNif() {
		assertTrue(nif3 != null);
	}

	@Test
	public void testGetTexto() {
		assertEquals(nif1.getTexto(),"12345678A");
		assertEquals(nif2.getTexto(),"87654321B");
		assertEquals(nif3.getTexto(),"13426875C");
	}

	@Test
	public void testSetTexto() {
		nif1.setTexto("12345678A");
		nif2.setTexto("87654321B");
		nif3.setTexto("13426875C");
		assertEquals(nif1.getTexto(),"12345678A");
		assertEquals(nif2.getTexto(),"87654321B");
		assertEquals(nif3.getTexto(),"13426875C");
	}

	@Test
	public void testToString() {
		assertEquals(nif1.toString(),"12345678A");
		assertEquals(nif2.toString(),"87654321B");
		assertEquals(nif3.toString(),"13426875C");
	
		
	}

}//class