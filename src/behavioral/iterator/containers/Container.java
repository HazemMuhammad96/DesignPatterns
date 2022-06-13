package behavioral.iterator.containers;

import behavioral.iterator.iterators.Iterator;

public interface Container<T> {
    public Iterator<T> getIterator();
}
