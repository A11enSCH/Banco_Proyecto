package Logica;

import java.util.ArrayList;
import java.util.HashMap;

import Logica.*;

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
	public void crearCliente(Integer id, String nombre, String tipo) throws Exception{
		if(this.cliente.containsKey(id)){
			throw new Exception("cliente repetido");
		}else {
			Clientes cliente = new Clientes(id, tipo, tipo);
			this.cliente.put(id, cliente);
		}
	}
	
	public void crearProducto(String nombre, double saldo, String tipo, int idCliente) {
		if (!this.cliente.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteCuenta(nombre)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoCuenta(idCliente, tipo)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + tipo);
		}else {
			Producto_financiero producto_f = new Producto_financiero(nombre, saldo, tipo, this.cliente.get(idCliente));
			this.cliente.get(idCliente).getProducto_f().put(nombre, producto_f);
			this.producto_financieros.add(producto_f);
		}
		
	}
	
	public void almacenar() {
		// TODO Auto-generated method stub
		
	}
	public void cargar() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean existeTipoCuenta(int idCliente, String tipo) {
		for(Integer numero : this.cliente.get(idCliente).getProducto_f().keySet()) {
			if(this.cliente.get(idCliente).getProducto_f().get(numero).getTipo().equals(tipo)) {
				return true;
			}
		}
		return false;
	}

	public boolean exiteCuenta(String nombre) {
		for(Producto_financiero producto_financiero : this.producto_financieros) {
			if(((Producto_financiero) producto_financieros).getNombre() == nombre) {
				return true;
			}
		}
		return false;
	}
	
}
