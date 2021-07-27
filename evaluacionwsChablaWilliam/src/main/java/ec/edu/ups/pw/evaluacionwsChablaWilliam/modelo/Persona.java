package ec.edu.ups.pw.evaluacionwsChablaWilliam.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Persona {
	
	@Id
	private String cedula;
	
	private String nombre;
	private String apellido;
	
	@OneToOne
	@JoinColumn(name="id_codigo")
	private Credito credito;
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the credito
	 */
	public Credito getCredito() {
		return credito;
	}
	/**
	 * @param credito the credito to set
	 */
	public void setCredito(Credito credito) {
		this.credito = credito;
	}

}
