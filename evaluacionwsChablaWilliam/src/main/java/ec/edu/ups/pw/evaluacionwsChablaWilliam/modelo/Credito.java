package ec.edu.ups.pw.evaluacionwsChablaWilliam.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credito {

	@Id
	private int codigo;
	
	private Double monto;
	private int numMeses;
	private String fecha;
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the monto
	 */
	public Double getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	/**
	 * @return the numMeses
	 */
	public int getNumMeses() {
		return numMeses;
	}
	/**
	 * @param numMeses the numMeses to set
	 */
	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
