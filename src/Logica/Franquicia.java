package Logica;

import java.util.ArrayList;
import java.util.HashMap;

public class Franquicia {
	private ArrayList<Producto_financiero> producto_financieros;
	private HashMap<Integer, Clientes> cliente;
	
	public ArrayList<Producto_financiero> getProducto_financieros() {
		return producto_financieros;
	}
	public HashMap<Integer, Clientes> getCliente() {
		return cliente;
	}
	
	public Franquicia() {
		this.cliente = new HashMap<Integer, Clientes>();
		this.producto_financieros = new ArrayList<Producto_financiero>();
	}
	public void crearCliente(int id, String nombre, String tipo) throws Exception{
		
		
	}
	
	
	
}
