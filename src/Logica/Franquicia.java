package Logica;

import java.util.ArrayList;
import java.util.HashMap;

import Logica.*;

public class Franquicia {
	private ArrayList<Producto_financieroG>productoFG;
	private ArrayList<Producto_financieroL>productoFL;
	private HashMap<Integer, Clientes>clientes;
	
	public ArrayList<Producto_financieroG> getProductoFG() {
		return productoFG;
	}
	public ArrayList<Producto_financieroL> getProductoFL() {
		return productoFL;
	}
	public HashMap<Integer, Clientes> getCliente() {
		return clientes;
	}
	
	public Franquicia() {
		this.clientes = new HashMap<Integer, Clientes>();
		this.productoFG = new ArrayList<Producto_financieroG>();
		this.productoFL = new ArrayList<Producto_financieroL>();
	}
	
	public void crearCliente(Integer id, String nombre, String tipo) throws Exception{
		if(this.clientes.containsKey(id)){
			throw new Exception("cliente repetido");
		}else {
			Clientes clientes = new Clientes(id, nombre, tipo) {
			};
			this.clientes.put(id, clientes);
		}
	}
	
	public void crearProductoG(int numero, double saldo, String nombre, int idCliente) {
		if (!this.clientes.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteProductoG(numero)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoProductoG(idCliente, nombre)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + nombre);
		}else {
			Producto_financieroG PG = new Producto_financieroG(numero, saldo, nombre, this.clientes.get(idCliente)) {
			};
			this.clientes.get(idCliente).getProducto_fg().put(numero, PG);
			this.productoFG.add(F);
		}
		
	}
	
	public void almacenar() {
		// TODO Auto-generated method stub
		
	}
	public void cargar() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean existeTipoProductoG(int idCliente, String nombre) {
		for(Integer numero : this.clientes.get(idCliente).getProducto_fg().keySet()) {
			if(this.clientes.get(idCliente).getProducto_fg().get(numero).getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	public boolean exiteProductoG(int numero) {
		for(Producto_financieroG productoG : this.productoFG) {
			if(productoG.getNumero() == numero) {
				return true;
			}
		}
		return false;
	}
	
	private boolean existeTipoProductoL(int idCliente, String nombre) {
		for(Integer numero : this.clientes.get(idCliente).getProducto_fl().keySet()) {
			if(this.clientes.get(idCliente).getProducto_fl().get(numero).getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	public boolean exiteProductoL(int numero) {
		for(Producto_financieroL productoL : this.productoFL) {
			if(productoL.getNumero() == numero) {
				return true;
			}
		}
		return false;
	}
	
}
