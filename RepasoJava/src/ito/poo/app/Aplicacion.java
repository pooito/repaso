package ito.poo.app;

import ito.poo.clases.Programador;
import ito.poo.clases.Proyecto;
import java.time.LocalDate;



public class Aplicacion {
	
	static Programador programador;
	static Proyecto proyectos[]= new Proyecto[3];
	
	static void creaProyectos() {
		proyectos[0]= new Proyecto("Proyecto 1",55);
		proyectos[1]= new Proyecto("Proyecto 2",45);
		proyectos[2]= new Proyecto("Proyecto 3",25);
	}
	
	static void creaProgramador() {
		programador= new Programador("Tito Lopez",LocalDate.now().minusDays(5));
	}
	
	static void addLenguajes() {
		programador.addLenguage("Java");
		programador.addLenguage("PHP");
		programador.addLenguage("Scala");
		programador.addLenguage("Javascript");
	}
	
	static void asignaProyectos() {
		programador.addProyecto(proyectos[0]);
		programador.addProyecto(proyectos[2]);
	}
	
	static void addTareas() {
		programador.addTarea(LocalDate.now().minusDays(3), 10, proyectos[0]);
		programador.addTarea(LocalDate.now().minusDays(3), 14, proyectos[2]);
		programador.addTarea(LocalDate.now().minusDays(2), 14, proyectos[0]);
		programador.addTarea(LocalDate.now().minusDays(1), 10, proyectos[0]);
		programador.addTarea(LocalDate.now(), 12, proyectos[2]);
	}

	public static void run() {
	   creaProgramador();
	   addLenguajes();
	   creaProyectos();
	   asignaProyectos();
	   addTareas();
	   System.out.println(programador);
	   System.out.println(programador.getTarearealizada());
	   System.out.println(proyectos[0]);
	   System.out.println(proyectos[1]);
	   System.out.println(proyectos[2]);
	   System.out.println(programador.costoEnFecha(LocalDate.now().minusDays(3)));
	   System.out.println(programador.costoPorProyecto(proyectos[0]));
	   System.out.println(programador.getPago(3, 2021));
	}
}
