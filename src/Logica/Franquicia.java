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
	
	public void crearTarjeta(int numero, double saldo, String nombre, int idCliente) throws Exception{
		if (!this.clientes.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteProductoG(numero)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoProductoG(idCliente, nombre)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + nombre);
		}else {
			Producto_financieroG tarjeta = new Producto_financieroG() {
			};
			this.clientes.get(idCliente).getProducto_fg().put(numero, tarjeta);
			this.productoFG.add(tarjeta);
		}

	}
	
	public void crearAhorros(int numero, double saldo, String nombre, int idCliente) throws Exception{
		if (!this.clientes.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteProductoG(numero)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoProductoG(idCliente, nombre)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + nombre);
		}else {
			Producto_financieroG ahorro = new Producto_financieroG() {
			};
			this.clientes.get(idCliente).getProducto_fg().put(numero, ahorro);
			this.productoFG.add(ahorro);
		}

	}
	
	public void crearCorriente(int numero, double saldo, String nombre, int idCliente) throws Exception{
		if (!this.clientes.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteProductoG(numero)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoProductoG(idCliente, nombre)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + nombre);
		}else {
			Producto_financieroG corriente = new Producto_financieroG() {
			};
			this.clientes.get(idCliente).getProducto_fg().put(numero, corriente);
			this.productoFG.add(corriente);
		}

	}
	
	public void crearInversion(int numero, double saldo, String nombre, int idCliente) throws Exception{
		if (!this.clientes.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteProductoG(numero)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoProductoG(idCliente, nombre)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + nombre);
		}else {
			Producto_financieroG inversion = new Producto_financieroG() {
			};
			this.clientes.get(idCliente).getProducto_fg().put(numero, inversion);
			this.productoFG.add(inversion);
		}

	}
	
	public void crearHipoteca(int numero, double saldo, String nombre, int idCliente) throws Exception{
		if (!this.clientes.containsKey(idCliente)) {
			throw new Exception ("Cliente No existente");
		}else if(this.exiteProductoG(numero)){
			throw new Exception ("La cuenta ya existe");
		} else if(this.existeTipoProductoG(idCliente, nombre)) {
			throw new Exception ("El cliente ya tiene una cuenta de tipo : " + nombre);
		}else {
			Producto_financieroG hipoteca = new Producto_financieroG() {
			};
			this.clientes.get(idCliente).getProducto_fg().put(numero, hipoteca);
			this.productoFG.add(hipoteca);
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
