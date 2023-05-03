package com.pp2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner1 t1 = new Runner1();
		Runner2 t2 = new Runner2();
		
		t1.start(); //EJECUTAR EL HILO1
		t2.start(); //EJECUTAR EL HILO2
	} //DETERMINISTA ES MAS PREDECIBLE

}
