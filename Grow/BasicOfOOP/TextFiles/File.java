package Grow.BasicOfOOP.TextFiles;

public abstract class File {
    private Directory dir;
    private String name;

    public File(Directory dir, String name) {
        this.dir = dir;
        this.name = name;
    }

    public Directory getDir() {
        return dir;
    }

    public void setDir(Directory dir) {
        this.dir = dir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("File {");
        builder.append(name);
        builder.append("}");
        return builder.toString();
    }
}
