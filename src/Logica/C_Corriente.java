package Logica;

public class C_Corriente extends Producto_financiero{

	@Override
	protected void retirar(int valor) throws Exception {
		if(valor <= this.saldo) {
			this.saldo -= valor;			
		}else {
			this.saldo -=valor;
			throw new Exception("Numeros negativos");
		}super.retirar(valor);
	}
	
	public void cheque(int valor) throws Exception {
		if(this.saldo <= valor) {
			try {
				this.retirar(valor);
			} catch (Exception e) {
				
			} 
		}
	}

}
