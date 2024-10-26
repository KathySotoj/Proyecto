package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteSubjectTest {

    @Test
    void testObserverNotification() {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.notifyObservers();

        assertNotNull(observer1);
        assertNotNull(observer2);
    }
}
