package service;

public class MuteSound implements SoundBehavior{

    @Override
    public void makeSound(){
        System.out.println("I cannot making sound");
    }

    public MuteSound() {
    }

    @Override
    public String toString() {
        return "MuteSound{}";
    }
}
