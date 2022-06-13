package structural.adapter.exercise;

import java.io.File;

public class FileManagerImp implements FileManager {

    FileAdapter a = new FileAdapter();
    @Override
    public String open(String s) {
        return null;
    }

    @Override
    public String close() {
        return null;
    }

    @Override
    public String read(int pos, int amount, byte[] data) {
        return null;
    }

    @Override
    public String write(int pos, int amount, byte[] data) {
        return null;
    }
}
