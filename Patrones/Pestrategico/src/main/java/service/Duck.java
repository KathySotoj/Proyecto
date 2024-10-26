package service;


public abstract class Duck {

    protected FlyBehavior fb;
    protected SoundBehavior sb;

    public Duck(){

    }

public abstract void display();

public void performFLy(){
    fb.fly();
}

public void swim(){
    System.out.println("The duck is swimming");
}

public void performQuack(){
    sb.makeSound();
}

@Override
public String toString(){

    return "Duck{}";
}
}
