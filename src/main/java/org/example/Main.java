package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Hamburger hamburger = new Hamburger("Basic", "normal", 3.56, "wrap");
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);

        System.out.println(hamburger.itemizeHamburger());
        System.out.println("---------------------------------------------------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        System.out.println(hamburger.itemizeHamburger());
        System.out.println("---------------------------------------------------------------------------");
        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();

        System.out.println(db.itemizeHamburger());
    }
}