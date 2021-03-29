/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;

import java.time.LocalDate;

public class TareaRealizada {
		
	private java.time.LocalDate fecha = null;
	private int numLineas = 0;

	public TareaRealizada() {
		// Start of user code constructor for TareaRealizada)
		super();
		// End of user code
	}

	public TareaRealizada(LocalDate fecha, int numLineas) {
		super();
		this.fecha = fecha;
		this.numLineas = numLineas;
	}
	public java.time.LocalDate getFecha() {
		return this.fecha;
	}

	
	public void setFecha(java.time.LocalDate newFecha) {
		this.fecha = newFecha;
	}

	
	public int getNumLineas() {
		return this.numLineas;
	}

	
	public void setNumLineas(int newNumLineas) {
		this.numLineas = newNumLineas;
	}

	@Override
	public String toString() {
		return "Tarea[Fecha=" + fecha + ", # Líneas=" + numLineas + "]";
	}

}
