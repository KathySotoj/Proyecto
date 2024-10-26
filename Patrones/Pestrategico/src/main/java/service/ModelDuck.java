package service;

public class ModelDuck extends Duck{

    public ModelDuck() {
        fb = new FlyNoWay ();
        sb = new MuteSound();

    }

    @Override
    public String toString(){
        return "ModelDuck{}";
    }

    @Override
    public void display(){
        System.out.println("Soy el pato modelo");
    }

    public void setFb(FlyLikeRocket flyLikeRocket) {
    }
}
