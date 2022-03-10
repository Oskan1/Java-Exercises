package com.company;

public class Main extends Object{  // Object is already extended by default in main, no reason to specify.

    public static void main(String[] args) {
	    Audi audi = new Audi(34);
        audi.steer(45);
        audi.accelerate(30);
        audi.accelerate(20);
        audi.accelerate(-42);
    }
}
