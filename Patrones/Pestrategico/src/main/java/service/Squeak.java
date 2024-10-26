package service;

public class Squeak implements SoundBehavior{

    @Override
    public void makeSound (){
        System.out.println("I make squeak");
    }

    public Squeak() {
    }

    @Override
    public String toString(){
        return "squeak{}";
    }
}
