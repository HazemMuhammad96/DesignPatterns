package structural.adapter.exercise;

public class FileUtil {
    public String openFile(String s) {
        return "Opened " + s;
    }

    public String closeFile() {
        return "Closed";
    }

    public String readFromFile(int pos, int amount, byte[] data) {
        return "ReadFromFile";
    }

    public String writeToFile(int pos, int amount, byte[] data) {
        return "WriteToFile";
    }
}
