package behavioral.iterator.exercise;

import behavioral.iterator.iterators.Iterator;

public class LanguageIterator implements Iterator<String> {

    String[] langs;
    int index = 0;

    public LanguageIterator(String[] langs) {
        this.langs = langs;
    }

    @Override
    public boolean hasNext() {
        return index < langs.length;
    }

    @Override
    public String next() {
        return hasNext() ? langs[index++] : null;
    }
}
