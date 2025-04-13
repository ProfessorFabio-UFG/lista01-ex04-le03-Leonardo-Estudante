package principal;

import models.Robo;

public class Main {

	public static void main(String[] args) {
		Robo r1 = new Robo(1, 100);
		Robo r2 = new Robo(2, 200);
		
		r1.desligar();
		System.out.println(r1);
		r1.ligar();
		System.out.println(r1);
		r1.andar(2, 4);
		System.out.println(r1);
		r1.aspirar(50);
		System.out.println(r1);
		r1.parar();
		System.out.println(r1);
		
		System.out.println("----------------------------------------------");
		
		r2.desligar();
		System.out.println(r2);
		r2.ligar();
		System.out.println(r2);
		r2.andar(20, 50);
		System.out.println(r2);
		r2.aspirar(140);
		System.out.println(r2);
		r2.parar();
		System.out.println(r2);
		
	}

}
