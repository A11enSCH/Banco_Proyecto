package Logica;

import java.util.HashMap;

public abstract class Clientes {
	private int id;
	private String nombre;
	private String tipo;
	private HashMap<Integer, Producto_financieroG> producto_fg;
	private HashMap<Integer, Producto_financieroL> producto_fl;
	
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
	public HashMap<Integer, Producto_financieroG> getProducto_fg() {
		return producto_fg;
	}
	public void setProducto_fg(HashMap<Integer, Producto_financieroG> producto_fg) {
		this.producto_fg = producto_fg;
	}
	public HashMap<Integer, Producto_financieroL> getProducto_fl() {
		return producto_fl;
	}
	public void setProducto_fl(HashMap<Integer, Producto_financieroL> producto_fl) {
		this.producto_fl = producto_fl;
	}
	public Clientes(int id, String nombre, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.producto_fg = new HashMap<Integer, Producto_financieroG>();
		this.producto_fl = new HashMap<Integer, Producto_financieroL>();
	}
	
}
