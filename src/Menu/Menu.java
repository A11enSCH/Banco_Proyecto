package Menu;

import java.util.Scanner;

import Logica.Franquicia;
import Logica.Producto_financiero;

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
					this.crearProducto(sc);
				}/*else if(op == 3) {
					this.imprimirClientes();
				}else if(op == 4) {
					this.imprimirProductos();
				}*/else if(op == 5) {
					this.almacenar();
				}else if(op == 6) {
					this.cargar();
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}while (op != 0);
		sc.close();
	}
	
	private void cargar() {
		this.banco.cargar();
	}
	
	private void almacenar() {
		this.banco.almacenar();		
	}
	
	private void crearCliente(Scanner sc) throws Exception {
		System.out.println("Id:");
		int id = sc.nextInt();
		System.out.println("nombre:");
		String nombre = sc.next();
		System.out.println("tipo:");
		String tipo = sc.next();
		this.banco.crearCliente(id, nombre, tipo);
	}
	
	private void crearProducto(Scanner sc) throws Exception {
		System.out.println("Nombre:");
		int numero = sc.nextInt();
		System.out.println("Saldo:");
		int saldo = sc.nextInt();
		System.out.println("Tipo:");
		String tipo = sc.next();
		System.out.println("Id Cliente:");
		int idCliente = sc.nextInt();
		this.banco.crearProducto(numero, saldo, tipo, idCliente);
	}
}
