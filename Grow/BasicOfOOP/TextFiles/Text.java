package Grow.BasicOfOOP.TextFiles;

public class Text {

    private String str;

    public Text(String str) {
        this.str = str;
    }
    public void newText(String str){
        StringBuilder builder = new StringBuilder(this.str);
        builder.append(' ');
        this.str = builder.append(str).toString();
    }

    public String getStr() {
        return str;
    }
}
