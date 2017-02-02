package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean continuar = false;
		do{
			try{
				/*Aplicacion para dividir dos numeros introducidos por el usuario*/
				System.out.println("Introduzca dos numros a dividir");
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca el numerado");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println("El resultado es : "+resultado);
				continuar = false;
			}catch(ArithmeticException ae){
				System.out.println("No se puede dividir por cero");
				continuar = true;
			}catch (InputMismatchException ime) {
				System.out.println("Solo se admiten números");
				continuar = true;
			}catch (Exception e) {
				//Exception engloba todos as excepciones.
				System.out.println("Algún tipo de error ha ocurrido");
				continuar = true;
			}
		}while(continuar);
		
		System.out.println("Programa terminado");
		
	}

}
