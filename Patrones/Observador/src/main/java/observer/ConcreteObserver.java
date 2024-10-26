package observer;

public class ConcreteObserver implements Observer {
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Observer notified of subject change: " + subject);
    }

    @Override
    public String toString() {
        return "ConcreteObserver observing " + subject;
    }
}
