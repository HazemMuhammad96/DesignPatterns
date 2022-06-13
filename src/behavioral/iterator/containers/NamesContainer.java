package behavioral.iterator.containers;

import behavioral.iterator.iterators.Iterator;
import behavioral.iterator.iterators.NamesIterator;

public class NamesContainer implements Container<String> {
    private String[] names = {"Hazem", "Wael", "Maged", "Ziad", "Mohab", "Abaza"};

    @Override
    public Iterator<String> getIterator() {
        return new NamesIterator(names);
    }
}
