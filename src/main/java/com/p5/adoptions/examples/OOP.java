package com.p5.adoptions.examples;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.Cat;

public class OOP {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Animal("Dog", "photo.jpg");
        Animal animal2 = new Animal().setName("Dog").setPhotoUrl("photo");


        // Polymorphism
        Cat cat = new Cat("Machi", "photo");
        Animal catAnimal = new Cat("Zoro", "photo");

        cat.speak();
        catAnimal.speak();

    }
}
