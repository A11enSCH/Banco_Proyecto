package Logica;

public abstract class Producto_financiero {
	private String nombre;
	private Clientes cliente;
	private String tipo;
	
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
	
	public abstract double consignar();
	public abstract double retirar();
}
//Metodos para retirar y consignar
/*public void retirar(int valor) throws Exception {
	if(valor <= this.saldo) {
		this.saldo -= valor;			
	}else {
		throw new Exception("Saldo insuficiente");
	}
}

public void transferir(Cuenta cuentaDestino, int valor) throws Exception{
	this.retirar(valor);
	cuentaDestino.consignar(valor);
}*/