package org.example;

public class Main {
    public static void main(String[] args) {

        Plate plate1 = new Plate(10);
        Cat[] familyCats = {
          new Cat("Bars", 3),
          new Cat("Chick", 4),
          new Cat("Soul", 2),
          new Cat("Rem", 5),
        };
        plate1.info();
        for (Cat cat: familyCats) {
            cat.eat(plate1);
            if (!cat.isSatiety()){
                plate1.putEat(6);
                cat.eat(plate1);
            }
        }
    }
}