package Patron;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    void testIterator() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        Iterator iterator = aggregate.createIterator();

        assertTrue(iterator.hasNext());
        assertEquals("Item 1", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("Item 2", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("Item 3", iterator.next());

        assertFalse(iterator.hasNext());
    }

    @Test
    void testRemove() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");

        Iterator iterator = aggregate.createIterator();

        assertEquals("Item 1", iterator.next());
        iterator.remove();

        assertEquals("Item 2", iterator.next());
        iterator.remove();

        assertFalse(iterator.hasNext());
    }
}
