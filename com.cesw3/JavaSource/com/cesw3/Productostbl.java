package com.cesw3;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the productostbl database table.
 * 
 */
@Entity
@NamedQuery(name="Productostbl.findAll", query="SELECT p FROM Productostbl p")
public class Productostbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_producto")
	private String idProducto;

	@Column(name="tipo_producto")
	private String tipoProducto;

	@Column(name="valor_producto")
	private BigInteger valorProducto;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="nombre_producto", referencedColumnName="productos")
	private Factura factura;

	public Productostbl() {
	}

	public String getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getTipoProducto() {
		return this.tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public BigInteger getValorProducto() {
		return this.valorProducto;
	}

	public void setValorProducto(BigInteger valorProducto) {
		this.valorProducto = valorProducto;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}