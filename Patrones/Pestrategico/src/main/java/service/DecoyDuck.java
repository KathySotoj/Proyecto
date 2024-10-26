package service;

public class DecoyDuck extends Duck{

    public DecoyDuck (){
        fb = new FlyNoWay ();
        sb = new Quack();
    }

    @Override
    public String toString(){
        return "DecoyDuck{}";
    }

    @Override
    public void display(){
        System.out.println("I am a Decoy Duck");
    }
}
