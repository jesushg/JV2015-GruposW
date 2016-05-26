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
 * Realiza un test sobre la clase Contraseña del modelo.
 * Test textoValido no implementado aún.
 * Test toString no implementado aún.
 * 
 * @author Fernando Meseguer Fernández
 * 26/05/2016
 */
public class ContraseñaTest {
	
	private Contraseña contraseña1;
	private Contraseña contraseña2;
	private Contraseña contraseña3;
	
	@Before
	public void crearObjectosPrueba(){
		contraseña1 = new Contraseña();
		contraseña2 = new Contraseña("holakase");
		contraseña3 = new Contraseña(simulacion2);
	}
	
	@After
	public void borrarObjetosPrueba(){
		contraseña1 = null;
		contraseña2 = null;
		contraseña3 = null;
	}
	
	@Test
	
	private boolean testTextoValido(String texto) {
		String texto = "eeeeeeooo";
		if (texto != null 
				&& util.Formato.validar(texto, Formato.PATRON_CONTRASEÑA3)) {
			return true;
		}
		return false;
		
		//no queda claro este método
	}
	
	@Test
	public void testSetTexto(){
		String texto = "holakase";
		contraseña1.setTexto(texto);
		assertEquals(contraseña1.toString(), texto);
	}
	
	@Test
	public void testEncriptar(){
		String claveAcceso = "holakase";
		echo util.Criptografia.cesar(claveAcceso);
	}

	@Test
	public void testToString(){
		// ?¿ ni idea
	}
	
}
