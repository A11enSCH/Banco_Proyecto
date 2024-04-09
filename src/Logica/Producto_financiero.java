package Logica;

public abstract class Producto_financiero {
	private String nombre;
	private Clientes cliente;
	private String tipo;
	protected double saldo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
	protected void transferir(Producto_financiero productoDestino, int valor) throws Exception{
		this.retirar(valor);
		productoDestino.consignar(valor);
	}
	
}
