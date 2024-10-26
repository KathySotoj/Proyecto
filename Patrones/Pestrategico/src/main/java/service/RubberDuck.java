package service;

public class RubberDuck extends Duck{

    RubberDuck(){
        fb = new FlyNoWay ();
        sb = new Squeak ();
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }

    @Override
    public void display(){
        System.out.println("I am a Rubber Duck");
    }

}
