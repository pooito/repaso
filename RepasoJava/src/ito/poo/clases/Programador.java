/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.ArrayList;

public class Programador {
	
	private String nombre = "";
	private java.time.LocalDate fechaIngreso = null;
	private HashSet<String> lenguages = new HashSet<String>();
	private HashSet<Proyecto> proyectos = new HashSet<Proyecto>();
	private ArrayList<TareaRealizada> tareasRealizadas = new ArrayList<TareaRealizada>();

	
	public Programador() {
		// Start of user code constructor for Programador)
		super();
		// End of user code
	}

	public Programador(String nombre, LocalDate fechaIngreso) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
	}
	
	public void addLenguage(String lenguage) {
		this.lenguages.add(lenguage);
	}
	
	public void addProyecto(Proyecto proyecto) {
		// Start of user code for method addProyecto
		this.proyectos.add(proyecto);
		// End of user code
	}

	
	public void addTarea(java.time.LocalDate fecha, int numLineas, Proyecto proyecto) {
		// Start of user code for method addTarea
		if(this.proyectos.contains(proyecto)) {
		      TareaRealizada tareaRealiza= new TareaRealizada(fecha,numLineas);
		      this.tareasRealizadas.add(tareaRealiza);
		      proyecto.getTareasRealizada().add(tareaRealiza);
		}
		// End of user code
	}


	public float costoEnFecha(java.time.LocalDate fecha) {
		// Start of user code for method costoEnFecha
		float costoEnFecha = 0F;
		for(TareaRealizada tr: tareasRealizadas) {
			if(tr.getFecha().isEqual(fecha)) {
				for(Proyecto p:proyectos) {
					if(p.getTareasRealizada().contains(tr)) {
						costoEnFecha+=p.getCostoPorLinea()*tr.getNumLineas();
					    break;
					}
				}
			}
		}
		return costoEnFecha;
		// End of user code
	}

	
	public float costoPorProyecto(Proyecto proyecto) {
		// Start of user code for method costoPorProyecto
		float costoPorProyecto = 0F;
		for(TareaRealizada tr:proyecto.getTareasRealizada())
			for(TareaRealizada tr2:this.tareasRealizadas)
				if(tr.equals(tr2)) {
					costoPorProyecto+=tr.getNumLineas()*proyecto.getCostoPorLinea();
					break;
				}
					
		return costoPorProyecto;
		// End of user code
	}

	
	public Proyecto getProyecto(int indice) {
		// Start of user code for method getProyecto
		Proyecto getProyecto = null;
		if(indice<this.getProyectos().size())
			getProyecto=(Proyecto)(this.proyectos.toArray())[indice];
		return getProyecto;
		// End of user code
	}

	
	public float getPago(int mes, int a_o) {
		// Start of user code for method getPago
		float getPago = 0F;
		for(TareaRealizada tr:this.tareasRealizadas){
			if(tr.getFecha().getMonthValue()==mes && tr.getFecha().getYear()==a_o)
				for(Proyecto p: this.proyectos)
					if(p.getTareasRealizada().contains(tr))
						getPago+=tr.getNumLineas()*p.getCostoPorLinea();
		}
		return getPago;
		// End of user code
	}

	
	public String getNombre() {
		return this.nombre;
	}

	
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	
	public java.time.LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}

	
	public void setFechaIngreso(java.time.LocalDate newFechaIngreso) {
		this.fechaIngreso = newFechaIngreso;
	}

	
	public HashSet<String> getLenguages() {
		return this.lenguages;
	}

	
	public HashSet<Proyecto> getProyectos() {
		return this.proyectos;
	}

	
	public ArrayList<TareaRealizada> getTarearealizada() {
		return this.tareasRealizadas;
	}

	@Override
	public String toString() {
		return "Programador [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", lenguages=" + lenguages + "]";
	}

}
