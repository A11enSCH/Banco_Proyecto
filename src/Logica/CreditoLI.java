package Logica;

import java.util.Scanner;

public class CreditoLI extends Producto_financiero{
	Scanner sc = new Scanner(System.in);
	private double prestamo,valor_f;
	private int op, tiempo;

	public double getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(double prestamo) {
		this.prestamo = prestamo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public double prestamo() {
		System.out.println("Ingrese el valor del prestamo y el tiempo de extension");
		prestamo = sc.nextDouble(); 
		setTiempo(sc.nextInt());
		System.out.println("Si desea un prestamo de valor" + prestamo + "que tiene un interes del 10% y tiene que pagarse a lo largo de" + tiempo +  ". Si desea seguir con el proceso presione 1");
		op = sc.nextInt();
		if (op == 1) {
			saldo += prestamo;
			System.out.println("Prestamo realizado");
		}else {
			System.out.println("No se realiza el prestamo");
		}
		valor_f = (prestamo+((prestamo*10)/100))*tiempo;
		System.out.println("EL valor a pagar final es de: " + valor_f );
		return saldo;
	}

}
