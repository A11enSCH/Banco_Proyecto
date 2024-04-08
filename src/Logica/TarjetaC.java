package Logica;

public class TarjetaC extends Producto_financiero{
	protected String contraseña;
	
	
	@Override
	protected void consignar(int valor) {
		if(contraseña == contraseña) {
			this.saldo += valor;
		}
		super.consignar(valor);
	}
	
	@Override
	protected void retirar(int valor) throws Exception {
		if(contraseña == contraseña) {
			if(valor <= this.saldo) {
				this.saldo -= valor;			
			}else {
				throw new Exception("Saldo insuficiente");
			}
		}
		super.retirar(valor);
	}

	@Override
	protected void transferir(Producto_financiero productoDestino, int valor) throws Exception {
		if(contraseña == contraseña) {
			this.retirar(valor);
		}
		super.transferir(productoDestino, valor);
	}
}
