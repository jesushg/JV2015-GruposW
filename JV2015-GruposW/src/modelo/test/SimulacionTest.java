package modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Mundo;
import modelo.Simulacion;
import modelo.Simulacion.EstadoSimulacion;
import modelo.Usuario;
import util.Fecha;

/**
 * Realiza un test sobre la clase Simulación del modelo.
 * Test toString no implementado aún.
 * 
 * @author Jesús Hernández Galián
 * 19/05/2016
 */
public class SimulacionTest {
	
	private Simulacion simulacion1;
	private Simulacion simulacion2;
	private Simulacion simulacion3;
	
	@Before
	public void crearObjectosPrueba(){
		simulacion1 = new Simulacion();
		simulacion2 = new Simulacion(new Usuario(), new Fecha(), new Mundo(), EstadoSimulacion.PREPARADA);
		simulacion3 = new Simulacion(simulacion2);
	}
	
	@After
	public void borrarObjetosPrueba(){
		simulacion1 = null;
		simulacion2 = null;
		simulacion3 = null;
	}
	
	@Test
	public void testGetUsr(){
		assertNotNull(simulacion1.getUsr());
	}
	
	@Test
	public void testGetMundo(){
		assertNotNull(simulacion1.getUsr());
	}
	
	@Test
	public void testGetFecha(){
		assertNotNull(simulacion1.getFecha());
	}
	
	@Test
	public void testGetEstado(){
		assertNotNull(simulacion1.getEstado());
	}
	
	@Test
	public void testSetUsr(){
		Usuario usuario = new Usuario();
		usuario.setNombre("Jesús");
		simulacion1.setUsr(usuario);
		assertEquals(simulacion1.getUsr(), usuario);
	}
	
	@Test
	public void testSetMundo(){
		Mundo mundo = new Mundo();
		mundo.setNombre("Mundo de Jesús");
		simulacion1.setMundo(mundo);
		assertEquals(simulacion1.getMundo(), mundo);
	}
	
	@Test
	public void testSetFecha(){
		Fecha fecha = new Fecha(1994, 12, 6);
		simulacion1.setFecha(fecha);
		assertEquals(simulacion1.getFecha(), fecha);
	}
	
	@Test
	public void testSetEstado(){
		EstadoSimulacion estado = EstadoSimulacion.COMPLETADA;
		simulacion1.setEstado(estado);
		assertEquals(simulacion1.getEstado(), estado);
	}
	
	@Test
	public void testToString(){
		// No queda muy claro
	}
	
	/**
	 * Comprueba que el constructor copia realiza
	 * la copia del objeto correctamente.
	 */
	@Test
	public void testConstructorSimulacion(){
		assertEquals(simulacion2.getUsr(), simulacion3.getUsr());
		assertEquals(simulacion2.getFecha(), simulacion3.getFecha());
		assertEquals(simulacion2.getMundo(), simulacion3.getMundo());
		assertEquals(simulacion2.getEstado(), simulacion3.getEstado());
	}
	
}
