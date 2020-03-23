package Grow.BasicOfOOP.TextFiles;

public class TextFile extends File {

    private Text text;

    public TextFile(Directory dir, String name) {
        super(dir, name);
        text = new Text("");
        super.getDir().addFile(this);
    }
    public void addText(String string){
        text.newText(string);
    }
    public void printText(){
        System.out.println(text.getStr());
    }
    public void changeName(String fileName){
        this.setName(fileName);
    }
}
