package structural.compostie;

import java.util.List;

public class Folder {
    int size;
    List<Folder> folders;

    public void add(Folder f){
        folders.add(f);
    }

    public void remove(Folder f){
        folders.remove(f);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "size=" + size +
                ", folders=" + folders +
                '}';
    }
}
