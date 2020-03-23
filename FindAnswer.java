import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FindAnswer {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream stream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(outputStream);
        System.setOut(newStream);

        testString.printSomething();
        System.setOut(stream);

        String [] out = outputStream.toString().split(" ");
        int zeroIndex = Integer.parseInt(out[0]);
        int twoIndex = Integer.parseInt(out[2]);
        int answer = 0;
        switch (out[1]){
            case "+":{
                answer = zeroIndex + twoIndex;
                break;
            }
            case "-":{
                answer = zeroIndex - twoIndex;
                break;
            }
            case "*":{
                answer = zeroIndex * twoIndex;
                break;
            }
        }
        System.out.println(outputStream.toString().replaceAll("\\p{Cntrl}","") + answer);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
