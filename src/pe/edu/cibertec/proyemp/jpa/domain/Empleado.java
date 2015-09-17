package pe.edu.cibertec.proyemp.jpa.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.edu.cibertec.proyemp.jpa.listener.EmpleadoListener;


@Entity
//@EntityListeners(EmpleadoListener.class )

@Table(name = "tb_empleado")
public class Empleado {

	

	
	
	@Id
	@GeneratedValue
	@Column(name = "EMP_ID", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "EMP_DNI",unique = true,columnDefinition ="CHAR(8)")
	private String dni;
	
	
	@Column(name = "EMP_NOMBRE", nullable = false , length = 200)
	private String nombre;
	
	@Column(name = "EMP_APELLIDO", length = 50)
	private String apellido;
	
	
	
	@ManyToOne
	@JoinColumn(name = "DEP_ID")
	private Departamento departamento;
	
	@Column(name = "EMP_SALARIO", precision = 10 , scale = 2)
	private BigDecimal salario;
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "EMP_FEC_ING")
	@Temporal(value= TemporalType.DATE)
	private Date fechaIngreso;
	
	@Column(name = "EMP_ESTADO")
	private Integer estado;
	

	
	
	public Empleado(){}
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Empleado(String nombre, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + "]";
	}

	
}
