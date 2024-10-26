package service;

public class Quack implements SoundBehavior{
    public Quack(){}

    @Override
    public void makeSound () {
        System.out.println("I am Quack");
    }

    @Override
    public String toString(){
        return "Quack{}";
    }
}
