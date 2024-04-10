package Menu;

import java.util.Scanner;

import Logica.Franquicia;
import Logica.Producto_financieroG;
import Logica.Producto_financieroL;

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
				System.out.println("2. Escoger ProductoG");
				System.out.println("5. Escoger ProductoL");
				System.out.println("3. Imprimir Clientes");
				System.out.println("4. Imprimir ProductosG");
				System.out.println("6. Imprimir ProductosL");
				System.out.println("7. Almacenar a archivo de texto plano");
				System.out.println("8. Cargar desde archivo de texto plano");
				op = sc.nextInt();
				if(op == 1) {
					this.crearCliente(sc);				
				}else if(op == 2) {
					this.escogerProductoG(sc);
				}else if(op == 3) {
					this.escogerProductoL(sc);
				}/*else if(op == 4) {
					this.imprimirClientes();
				}else if(op == 5) {
					this.imprimirProductosG();
				}else if(op == 6) {
					this.imprimirProductosL();
				}*/else if(op == 7) {
					this.almacenar();
				}else if(op == 8) {
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

	private void escogerProductoG(Scanner sc) throws Exception {
		int esc=0;
		do {
			try {
				System.out.println("Seleccione el producto que desea obtener:");
				System.out.println("0. Salir");
				System.out.println("1. Cuenta ahorros");
				System.out.println("2. Cuenta corriente");
				System.out.println("3. Tarjeta de credito");
				esc = sc.nextInt();
				if(esc == 1) {
					this.crearAhorro(sc);				
				}else if(esc == 2) {
					this.crearCorriente(sc);
				}else if(esc == 3) {
					this.crearTarjeta(sc);
				}
			} catch (Exception e) {
				e.getMessage();
			}
		} while (esc!=0);
		sc.close();
	}

	private void crearTarjeta(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private void crearCorriente(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private void crearAhorro(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private void escogerProductoL(Scanner sc) throws Exception{
		int esc1=0;
		do {
			try {
				System.out.println("Seleccione el producto que desea obtener:");
				System.out.println("0. Salir");
				System.out.println("1. Credito hipotecario");
				System.out.println("2. Credito libre inversion");
				esc1 = sc.nextInt();
				if(esc1 == 1) {
					this.crearHipotecario(sc);				
				}else if(esc1 == 2) {
					this.crearLibreinversion(sc);
				}
			} catch (Exception e) {
				e.getMessage();
			}
		} while (esc1!=0);
		sc.close();
	}

	private void crearLibreinversion(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private void crearHipotecario(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	
}
/*System.out.println("Nombre:");
int numero = sc.nextInt();
System.out.println("Saldo:");
int saldo = sc.nextInt();
System.out.println("Tipo:");
String tipo = sc.next();
System.out.println("Id Cliente:");
int idCliente = sc.nextInt();
this.banco.crearProducto(numero, saldo, tipo, idCliente);*/