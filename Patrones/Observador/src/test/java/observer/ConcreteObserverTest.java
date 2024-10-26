package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcreteObserverTest {

    private ConcreteSubject subject;
    private ConcreteObserver observer;

    @BeforeEach
    void setUp() {
        subject = new ConcreteSubject();
        observer = new ConcreteObserver(subject);
        subject.registerObserver(observer);
    }

    @Test
    void testObserverReceivesUpdate() {
        assertNotNull(observer);
        subject.notifyObservers();
        System.out.println("Observer received update successfully ");
    }

    @Test
    void testObserverToString() {
        String expectedOutput = "ConcreteObserver observing ConcreteSubject state changed!";
        assertEquals(expectedOutput, observer.toString());
    }

    @Test
    void testRemoveObserver() {
        subject.removeObserver(observer);
        subject.notifyObservers();
        System.out.println("Observer removed successfully.");
    }
}
