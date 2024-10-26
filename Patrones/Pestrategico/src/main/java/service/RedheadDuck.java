package service;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        fb = new FlyWithWings();
        sb = new Quack();
    }

    @Override
    public String toString() {
        return "ReadheadDuck{}";
    }
    public void display(){
        System.out.println("I am a Redhead Duck");
    }
}
