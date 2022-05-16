package examen_16m_primo;

import java.util.Scanner;

public class Examen16M {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int numero=0;

		System.out.println("Buenos días, soy Paola Pérez");
		System.out.println("Introduce un número para saber si es primo o no:");
		numero=Integer.parseInt(ent.nextLine());
		
		primo(numero);

	}
	
	public static void primo(int num) {
		String cadena="1,";
	    boolean prime = true; 
	    for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            prime = false;
	            cadena +=i + " , ";
	            break;
	        }
	        if(num%num==0) {
	        	 cadena +=num + " , ";
	        }
	    }
	    if (prime)
	    	System.out.println("El numero es primo");
	    else
	    	System.out.println("El numero no es primo y es divisible por: " + cadena + "y "+num);
	}
}
