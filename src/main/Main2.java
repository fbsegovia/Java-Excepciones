package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		boolean continuar = false;
		
		int numerador = 0;
		
		
		
		do{
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca dos numros a dividir");
				System.out.println("Introduzca el numerador");
				numerador = sc.nextInt();
				continuar = false;
			}catch(ArithmeticException ae){
				System.out.println("No se puede dividir por cero");
				continuar = true;
			}catch (InputMismatchException ime) {
				System.out.println("Solo se admiten números");
				continuar = true;
			}catch (Exception e) {
				System.out.println("Algún tipo de error ha ocurrido");
				continuar = true;
			}
		}while(continuar);
		
		
		continuar = false;
		do{
			try{
				Scanner sc = new Scanner(System.in);
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
				System.out.println("Algún tipo de error ha ocurrido");
				continuar = true;
			}finally{
				//El metodo finally hace que se ejecute algo independientemente
				//de si sale bien o no, es decir, tanto si se pasa por el catch
				//como por el try, suelen estar asociados a cierres de conexiones,
				//ficheros, etc.
				
			}
		}while (continuar);
			
		
		System.out.println("Programa terminado");
		
	}
	
}
