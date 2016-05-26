package modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Contraseña;
/**
 * Realiza un test sobre la clase Contraseña del modelo.
 * Test textoValido no queda claro.
 * Test toString no implementado aún.
 * 
 * @author Fernando Meseguer Fernández
 * 26/05/2016
 */
public class ContraseñaTest {
	
	private Contraseña contraseña1;
	private Contraseña contraseña2;
	@Before
	public void crearObjectosPrueba(){
		contraseña1 = new Contraseña();
		contraseña2 = new Contraseña("holakase");
		new Contraseña(contraseña2);
	}
	
	@After
	public void borrarObjetosPrueba(){
		contraseña1 = null;
		contraseña2 = null;
	}
	
	@Test
	
	public void testTextoValido() {
		try{
			contraseña2.setTexto(null);
			
		} catch(AssertionError e){
			assertNotNull(contraseña2.toString());
		}
		//nada claro niggarl
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
		System.out.println(util.Criptografia.cesar(claveAcceso)); 
	}

	@Test
	public void testToString(){
		// ?¿ ni idea
	}
	
}
