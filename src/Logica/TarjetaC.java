package Logica;

import java.util.Scanner;

public class TarjetaC extends Producto_financieroG{
	protected String contraseña, contraseña_ing;
	Scanner sc = new Scanner(System.in);

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getContraseña_ing() {
		return contraseña_ing;
	}

	public void setContraseña_ing(String contraseña_ing) {
		this.contraseña_ing = contraseña_ing;
	}

	@Override
	protected void retirar(int valor) throws Exception {
		System.out.println("Ingresa la contraseña para poder hacer la transacción");
		if(verificar_c()== true) {
			if(valor <= this.saldo) {
				this.saldo -= valor;			
			}else {
				throw new Exception("Saldo insuficiente");
			}
		}
		super.retirar(valor);
	}

	@Override
	protected void transferir(Producto_financieroG productoDestino, int valor) throws Exception {
		System.out.println("Ingresa la contraseña para poder hacer la transacción");
		if(verificar_c()== true) {
			this.retirar(valor);
		}
		super.transferir(productoDestino, valor);
	}
	public boolean verificar_c() {
		contraseña_ing = sc.nextLine();
		if(contraseña_ing.equals(contraseña)) {
			return true;
		}else {
			return false;
		}
	}
}
