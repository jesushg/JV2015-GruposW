/**
 *  Proyecto: Juego de la vida.
 *  Comprueba todos los métodos de la clase Direccion.java  
 *  @since: prototipo2.1
 *  @source: DireccionTest.java 
 *  @version: 1.0 - 19/05/2016 
 *  @author: Luis
 */
   
package modelo.test;

import static org.junit.Assert.*;
import modelo.Direccion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DireccionTest {

	//Datos para las pruebas
	private Direccion direccion1;
	private Direccion direccion2;
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	
	@Before 
	public void creaDireccion() {
		direccion1 = new Direccion("30000", "Via", "10", "Murcia", "España"); 	
		direccion2 = new Direccion();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraProveedor() {
		Direccion direccion1 = null;
		Direccion direccion2 = null;
	}
		
	/**
	 * Test method for {@link modelo.Direccion#Direccion(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testDireccionConvencional() {
		assertNotNull(direccion1);
	}

	/**
	 * Test method for {@link modelo.Direccion#Direccion()}.
	 */
	@Test
	public void testDireccionPorDefecto() {
		assertNotNull(direccion2);
	}

	/**
	 * Test method for {@link modelo.Direccion#Direccion(modelo.Direccion)}.
	 */
	@Test
	public void testDireccionCopia() {
		Direccion d = new Direccion(direccion1);
		assertNotNull(d);
	}

	/**
	 * Test method for {@link modelo.Direccion#setCodigoPostal(java.lang.String)}.
	 */
	@Test
	public void testSetCodigoPostal() {
		direccion2.setCodigoPostal("30000");
		assertEquals(direccion2.getCodigoPostal(),"30000");
	}

	/**
	 * Test method for {@link modelo.Direccion#setVia(java.lang.String)}.
	 */
	@Test
	public void testSetVia() {
		direccion2.setVia("Via");
		assertEquals(direccion2.getVia(),"Via");
	}

	/**
	 * Test method for {@link modelo.Direccion#setNumero(java.lang.String)}.
	 */
	@Test
	public void testSetNumero() {
		direccion2.setNumero("10");
		assertEquals(direccion2.getNumero(),"10");
	}

	/**
	 * Test method for {@link modelo.Direccion#setPoblacion(java.lang.String)}.
	 */
	@Test
	public void testSetPoblacion() {
		direccion2.setPoblacion("Murcia");
		assertEquals(direccion2.getPoblacion(),"Murcia");
	}

	/**
	 * Test method for {@link modelo.Direccion#setPais(java.lang.String)}.
	 */
	@Test
	public void testSetPais() {
		direccion2.setPais("España");
		assertEquals(direccion2.getPais(),"España");
	}

	/**
	 * Test method for {@link modelo.Direccion#getCodigoPostal()}.
	 */
	@Test
	public void testGetCodigoPostal() {
		assertNotNull(direccion2.getCodigoPostal());
	}

	/**
	 * Test method for {@link modelo.Direccion#getVia()}.
	 */
	@Test
	public void testGetVia() {
		assertNotNull(direccion2.getVia());
	}

	/**
	 * Test method for {@link modelo.Direccion#getNumero()}.
	 */
	@Test
	public void testGetNumero() {
		assertNotNull(direccion2.getNumero());
	}

	/**
	 * Test method for {@link modelo.Direccion#getPoblacion()}.
	 */
	@Test
	public void testGetPoblacion() {
		assertNotNull(direccion2.getPoblacion());
	}

	/**
	 * Test method for {@link modelo.Direccion#getPais()}.
	 */
	@Test
	public void testGetPais() {
		assertNotNull(direccion2.getPais());
	}

	/**
	 * Test method for {@link modelo.Direccion#toString()}.
	 */
	@Test
	public void testToString() {
		assertNotNull(direccion1.toString());
	}

}
