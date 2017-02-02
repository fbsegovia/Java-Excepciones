package main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Main3 main3 = new Main3();
		boolean continuar = false;
		do{
			try {
				int numero = main3.pedirValor("Numerador");
			} catch (Exception e) {
				continuar=true;
			}
		}while(continuar);
		
		main3.pedirValor2();
		System.out.println("Fin del program");
	}

	private int pedirValor(String tipo) throws Exception{
		int numero = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca el "+tipo);
			numero = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return numero;
	}
	
	public int pedirValor2()throws RuntimeException{
		throw new RuntimeException();
	}
	
	
	
}
