package behavioral.iterator;

import behavioral.iterator.containers.NamesContainer;
import behavioral.iterator.exercise.LanguagesContainer;
import behavioral.iterator.iterators.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        NamesContainer container = new NamesContainer();
        Iterator<String> iterator = container.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        LanguagesContainer langContainer = new LanguagesContainer();
        Iterator<String> langIterator = langContainer.getIterator();
        while (langIterator.hasNext())
            System.out.println(langIterator.next());
    }
}
