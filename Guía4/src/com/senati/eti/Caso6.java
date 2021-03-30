package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[][] datos = {{"Joe Castillo","Rosa Flores","Ricardo Tello"},
				{"Callao","Comas","Puente Piedra"}};
		
		System.out.println("............... Impresion por filas .............");
		System.out.println("=================================================");
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c <datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}

		
		System.out.println("............ Impresion por columnas .............");
		System.out.println("=================================================");
		for (int c = 0; c < datos[0].length; c++) {
			for (int f = 0; f <datos.length; f++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}

	}

}
