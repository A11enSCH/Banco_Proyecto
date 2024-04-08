package Logica;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class C_Ahorros extends Producto_financiero{
	
	public double intereses() {
		
		Timer tiempos = new Timer();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(new Date());
		calendario.add(Calendar.YEAR, 1);
		Date fechaEjecutar = calendario.getTime();
		tiempos.schedule(new TimerTask() {
			double saldo;
			@Override
			public void run() {
				this.saldo += ((saldo*10)/100);
			}
		}, fechaEjecutar);
		return saldo;
	}

	
	
}
