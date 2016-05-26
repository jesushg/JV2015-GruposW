package accesoUsr.control;

import accesoDatos.Datos;
import accesoUsr.vista.VistaSimulacionTexto;
import modelo.Mundo;
import modelo.Simulacion;

public class ControlSimulacion {
	Datos datos = Datos.getInstancia();
	final int CICLOS = 120;
	VistaSimulacionTexto vista;
	Simulacion simulacion;
	Mundo mundo;
	
	public ControlSimulacion() {
		initControlSimulacion();
	}
	
	private void initControlSimulacion() {
		simulacion = datos.getDatosSimulaciones().get(0);
		mundo = simulacion.getMundo();	
		vista = new VistaSimulacionTexto();
		arrancarSimulacion();	
	}

	/**
	 * Ejecuta una simulación del juego de la vida, en la consola,
	 * durante un número de CICLOS.
	 */
	public void arrancarSimulacion() {
		int gen = 0; 		//Generaciones
		do {
			System.out.println("\nGeneración: " + gen);
			vista.mostrarMundo(this);
			mundo = (Mundo) mundo.actualizarEstado();
			gen++;
		}
		while (gen <= CICLOS);
	}
	
	public Simulacion getSimulacion() {
		return simulacion;
	}
	
	public Mundo getMundo() {
		return mundo;
	}
	
} // class
