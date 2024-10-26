package service;

public class FlyLikeRocket implements FlyBehavior{

    public FlyLikeRocket() {
    }

    @Override
    public void fly(){
        System.out.println("Si Puedo volar como coete");
    }

    @Override
    public String toString(){
        return "FlyLikeRocket{}";
    }
}
