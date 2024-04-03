package Menu;

import java.util.Scanner;

import Logica.Franquicia;

public class Menu {
	private Franquicia banco;
	
	public Menu() {
		this.banco = new Franquicia();
		this.presentacion();
	}

	public static void main(String[] args) {
		new Menu();
	}
	
	private void presentacion() {
		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
			try {
				System.out.println("Seleccione:");
				System.out.println("0. Salir");
				System.out.println("1. Crear Cliente");
				System.out.println("2. Crear Producto");
				System.out.println("3. Imprimir Clientes");
				System.out.println("4. Imprimir Productos");
				System.out.println("5. Alamcenar en archivo de texto plano");
				System.out.println("6. Cargar desde archivo de texto plano");
				op = sc.nextInt();
				if(op == 1) {
					this.crearCliente(sc);				
				}else if(op == 2) {
					this.creaCuenta(sc);
				}else if(op == 3) {
					this.imprimirClientes();
				}else if(op == 4) {
					this.imprimirCuentas();
				}else if(op == 5) {
					this.almacenar();
				}else if(op == 6) {
					this.cargar();
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}while (op!=0)
		sc.close();
	}
	
	
}
