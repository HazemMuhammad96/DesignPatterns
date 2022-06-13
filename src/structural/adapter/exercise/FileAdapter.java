package structural.adapter.exercise;

public class FileAdapter implements FileManager{

    FileUtil util = new FileUtil();

    @Override
    public String open(String s) {
        return util.openFile(s);
    }

    @Override
    public String close() {
        return util.closeFile();
    }

    @Override
    public String read(int pos, int amount, byte[] data) {
        return util.readFromFile(pos,amount,data);
    }

    @Override
    public String write(int pos, int amount, byte[] data) {
        return util.writeToFile(pos,amount,data);
    }
}
