package com.cesw3;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the facturas database table.
 * 
 */
@Entity
@Table(name="facturas")
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_factura")
	private String idFactura;

	private BigInteger cantidad;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_factura")
	private Date fechaFactura;

	private BigInteger total;

	//bi-directional many-to-one association to Productostbl
	@OneToMany(mappedBy="factura")
	private List<Productostbl> productostbls;

	//bi-directional many-to-one association to TiposProductostbl
	@OneToMany(mappedBy="factura")
	private List<TiposProductostbl> tiposProductostbls;

	public Factura() {
	}

	public String getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}

	public BigInteger getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigInteger cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public BigInteger getTotal() {
		return this.total;
	}

	public void setTotal(BigInteger total) {
		this.total = total;
	}

	public List<Productostbl> getProductostbls() {
		return this.productostbls;
	}

	public void setProductostbls(List<Productostbl> productostbls) {
		this.productostbls = productostbls;
	}

	public Productostbl addProductostbl(Productostbl productostbl) {
		getProductostbls().add(productostbl);
		productostbl.setFactura(this);

		return productostbl;
	}

	public Productostbl removeProductostbl(Productostbl productostbl) {
		getProductostbls().remove(productostbl);
		productostbl.setFactura(null);

		return productostbl;
	}

	public List<TiposProductostbl> getTiposProductostbls() {
		return this.tiposProductostbls;
	}

	public void setTiposProductostbls(List<TiposProductostbl> tiposProductostbls) {
		this.tiposProductostbls = tiposProductostbls;
	}

	public TiposProductostbl addTiposProductostbl(TiposProductostbl tiposProductostbl) {
		getTiposProductostbls().add(tiposProductostbl);
		tiposProductostbl.setFactura(this);

		return tiposProductostbl;
	}

	public TiposProductostbl removeTiposProductostbl(TiposProductostbl tiposProductostbl) {
		getTiposProductostbls().remove(tiposProductostbl);
		tiposProductostbl.setFactura(null);

		return tiposProductostbl;
	}

}