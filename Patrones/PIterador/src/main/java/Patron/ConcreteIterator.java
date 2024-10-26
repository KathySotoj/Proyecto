package Patron;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private final List<Object> collection;
    private int position = 0;

    public ConcreteIterator(List<Object> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size();
    }
    @Override
    public Object next() {
        if (this.hasNext()) {
            return collection.get(position++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("No element to remove");
        }
        collection.remove(--position);
    }
}