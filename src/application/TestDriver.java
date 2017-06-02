package application;

import opponents.*;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opponent p1 = new Rock("Cutman");

		System.out.println(p1.move());
		System.out.println(p1.move());
		System.out.println(p1.move());
		System.out.println(p1.move());
		System.out.println(p1.move());
		System.out.println(p1.move());
		System.out.println(p1.move());
		System.out.println(p1.move());
	}
}
