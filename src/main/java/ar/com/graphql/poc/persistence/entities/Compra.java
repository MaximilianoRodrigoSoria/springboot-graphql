package ar.com.graphql.poc.persistence.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int cantidad;
	private Date date;
	private String status;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_producto", nullable = true)
	private Producto producto;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente", nullable = true)
	private Cliente cliente;

	public Compra() {
	}

	public Compra(Long id, int cantidad, Date date, String status, Producto producto, Cliente cliente) {

		this.id = id;
		this.cantidad = cantidad;
		this.date = date;
		this.status = status;
		this.producto = producto;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", cantidad=" + cantidad + ", date=" + date + ", status=" + status + ", producto="
				+ producto + ", cliente=" + cliente + "]";
	}

}
