/*
 * Opisat klass Triangle. V kachestve svoistv vozmite dliny storon treugolnika.
 * Realizuyte metod, kotoryy budet vozvrashat' ploshad' etogo treugolnika.
 * Sozdayte neskolko obektov etogo klassa i protestiruyte ih
 * 
 */

package com.gmail.ahuliaiev;

public class Main {
	public static void main(String[] args) {
		Triangle trg1 = new Triangle();
		trg1.setA(6);
		trg1.setB(3);
		trg1.setC(6);

		Triangle trg2 = new Triangle(5, 7, 9);

		System.out.println(trg1.calculateArea());
		System.out.println(trg2.calculateArea());
	}
}