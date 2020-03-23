package Grow.BasicOfOOP.TextFiles;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("Book`s");
        String fileName = "20 000 leagues"; //under the sea";
        TextFile textFile = new TextFile(dir, fileName);
        String str = "The year 1866 was signalised by a remarkable incident, a mysterious and\n" +
                "puzzling  phenomenon,  which  doubtless  no  one has yet forgotten. Not to\n" +
                "mention  rumours  which  agitated  the maritime population and excited the\n" +
                "public  mind,  even  in  the  interior  of  continents, seafaring men were\n" +
                "particularly  excited.  Merchants,  common  sailors,  captains of vessels,\n" +
                "skippers, both of Europe and America, naval officers of all countries, and\n" +
                "the  Governments  of  several  States  on  the two continents, were deeply\n" +
                "interested in the matter.";
        textFile.addText(str);

        System.out.println("New file: " + textFile.getName());
        textFile.changeName("20 000 leagues under the sea");
        System.out.println("The File name changed to: " + textFile.getName());

        System.out.println("Print text: ");
        textFile.printText();

        System.out.println("Add text, printing");
        String str2 = "For  some time past vessels had been met by \"an enormous thing,\" a long\n" +
                "object, spindle-shaped, occasionally phosphorescent, and infinitely larger\n" +
                "and more rapid in its movements than a whale.";

        textFile.addText(str2);
        textFile.printText();

        System.out.println("Print directory: ");
        dir.getTextFiles().forEach(System.out::println);

        System.out.println("Add new text file and print directory: ");
        File file2 = new TextFile(dir, "Metallica. Master of Puppets");
        dir.getTextFiles().forEach(System.out::println);

        System.out.println("Delete file: ");
        dir.removeFile("Metallica. Master of Puppets");
        dir.getTextFiles().forEach(System.out::println);
    }
}
