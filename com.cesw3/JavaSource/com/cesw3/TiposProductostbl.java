package com.cesw3;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipos_productostbl database table.
 * 
 */
@Entity
@Table(name="tipos_productostbl")
@NamedQuery(name="TiposProductostbl.findAll", query="SELECT t FROM TiposProductostbl t")
public class TiposProductostbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo")
	private String idTipo;

	@Column(name="nombre_tipo")
	private String nombreTipo;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="id_tipo", referencedColumnName="tipo_producto")
	private Factura factura;

	public TiposProductostbl() {
	}

	public String getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public String getNombreTipo() {
		return this.nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}