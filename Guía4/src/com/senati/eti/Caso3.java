package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numeros = new Integer[5];
		
		for (int x = 0; x <= numeros.length - 1; x++) {
			System.out.println("Ingrese número "+(x+1)+": ");
			numeros[x] = sc.nextInt();
		}
		
		Arrays.sort(numeros);
		
		System.out.println("Números ordenados de forma ascendente");
		System.out.println("-------------------------------------");
		
		for (int x=0; x < numeros.length; x++)
			System.out.println("Número " + (x+1) + ": " + numeros[x]);
		
		Arrays.sort(numeros, Collections.reverseOrder());
		
		System.out.println("Números ordenados de forma descendente");
		System.out.println("-------------------------------------");
		
		for (int x=0; x < numeros.length; x++)
			System.out.println("Número " + (x+1) + ": " + numeros[x]);	
	}

}
