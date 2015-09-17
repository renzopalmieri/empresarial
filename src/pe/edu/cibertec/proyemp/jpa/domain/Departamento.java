package pe.edu.cibertec.proyemp.jpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TB_DEPARTAMENTOS")
public class Departamento {

	@Id
	@GeneratedValue
	@Column(name = "DEP_ID")
	private Long id;
	
	@Column(name = "DEP_NOMBRE")
	private String nombre;
	
	
	@Column(name = "DEP_PAIS",length = 30)
	private String pais;
	
	@Column(name = "DEP_CAPACIDAD",length = 30)
	private Integer capacidad;
	
	@Column(name = "DEP_ESTADO")
	private Integer estado;

	public Departamento(){}
	
	
	
	
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}


	//@OneToMany(mappedBy="departamento",cascade=CascadeType.PERSIST)
	@OneToMany(mappedBy="departamento", cascade =CascadeType.PERSIST)
	private List<Empleado> empleados = 
			new ArrayList<Empleado>();

	
	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	

	
	
}
