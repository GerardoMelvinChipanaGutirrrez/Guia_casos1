package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Precio de venta: ");
		int venta = sc.nextInt();
		
		float ct=venta+(venta*42/100);
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Costo de venta total: S/"+ df.format(ct));
	}

}
