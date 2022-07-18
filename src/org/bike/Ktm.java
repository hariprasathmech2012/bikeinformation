package org.bike;

public class Ktm implements Bike{


	public void cost() {
		System.out.println("cost is rs.200000");
		
	}


	public void speed() {
		System.out.println("speed is 300km/hr");
		
	}
	
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}
