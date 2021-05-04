package com.p5.adoptions.model;

public class Animal
{
    protected String name;
    protected String photoUrl;

    public Animal(String name, String photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public Animal() {

    }

    public void speak(){
        System.out.println("Animal speaks!");
    }

    protected void walk(){
        System.out.println("Animal walks!");
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Animal setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }
}
