package Logica;

import java.util.HashMap;

public abstract class Clientes {
	private int id;
	private String nombre;
	private String tipo;
	private HashMap<Integer, Producto_financiero> producto_f;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public HashMap<Integer, Producto_financiero> getProducto_f() {
		return producto_f;
	}
	public void setProducto_f(HashMap<Integer, Producto_financiero> producto_f) {
		this.producto_f = producto_f;
	}
	
	public Clientes(int id, String nombre, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.producto_f = new HashMap<Integer, Producto_financiero>();
	}
	
}
