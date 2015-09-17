package pe.edu.cibertec.proyemp.jpa.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import pe.edu.cibertec.proyemp.jpa.domain.Empleado;

public class EmpleadoListener {
	
	
	@PostLoad
	public void despuesDelLoad(Empleado emp){
	System.out.println(this.getClass().getName() + ": despues del load");

	}

	@PrePersist
	public void antesDeInsertar(Empleado emp){
	System.out.println(this.getClass().getName() + ": antes de insertar");
	}
		
	@PostPersist
	public void despuesDeInsertar(Empleado emp){
	System.out.println(this.getClass().getName() + ": despues de insertar");
	}

	
	
	

}
