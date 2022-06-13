package behavioral.iterator.exercise;

import behavioral.iterator.containers.Container;
import behavioral.iterator.iterators.Iterator;

public class LanguagesContainer implements Container<String> {
    @Override
    public Iterator<String> getIterator() {
        return new LanguageIterator(new String[]{"Arabic","English","Deutsch"});
    }
}
