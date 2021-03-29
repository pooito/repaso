/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;

import java.util.ArrayList;

public class Proyecto {
	
	private String nombre = "";
	private float costoPorLinea = 0F;
	private ArrayList<TareaRealizada> tareasRealizada = new ArrayList<TareaRealizada>();

	public Proyecto() {
		// Start of user code constructor for Proyecto)
		super();
		// End of user code
	}

	public Proyecto(String nombre, float costoPorLinea) {
		super();
		this.nombre = nombre;
		this.costoPorLinea = costoPorLinea;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	
	public float getCostoPorLinea() {
		return this.costoPorLinea;
	}

	
	public void setCostoPorLinea(float newCostoPorLinea) {
		this.costoPorLinea = newCostoPorLinea;
	}

	
	public ArrayList<TareaRealizada> getTareasRealizada() {
		return this.tareasRealizada;
	}

	@Override
	public String toString() {
		return "Proyecto [nombre=" + nombre + ", costoPorLinea=" + costoPorLinea + "]";
	}

}
