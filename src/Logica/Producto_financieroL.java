package Logica;

public abstract class Producto_financieroL{
	protected int numero;
	protected double saldo;
	protected String nombre;
	private Clientes cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNombre(int numero) {
		this.numero = numero;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected void consignar(int valor) {
		this.saldo += valor;
	}
	
	protected void retirar(int valor) throws Exception {
		if(valor <= this.saldo) {
			this.saldo -= valor;			
		}else {
			throw new Exception("Saldo insuficiente");
		}
	}
	
	
}
