package behavioral.iterator.iterators;

public class NamesIterator implements Iterator<String> {
    private String[] names;
    private int index = 0;

    public NamesIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        return hasNext() ? names[index++] : null;
    }
}
