package Grow.BasicOfOOP.TextFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Directory {
    private String dirName;
    private List<TextFile> textFiles;

    public Directory(String dirName) {
        this.dirName = dirName;
        textFiles = new ArrayList<>();
    }

    public String getDirName() {
        return dirName;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }
    public void changeDirName(String dirName){
        this.dirName = dirName;
    }
    public void addFile(TextFile file){
        this.textFiles.add(file);
    }
    public void removeFile(String fileName){
        IntStream.range(0, textFiles.size()).filter(i -> textFiles.get(i).getName().equalsIgnoreCase(fileName)).forEach(i -> textFiles.remove(i));
    }
}
