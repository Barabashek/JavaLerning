import java.io.*;


public class Separating {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStreamOne = new FileInputStream(reader.readLine());
        FileOutputStream outputStreamTwo = new FileOutputStream(reader.readLine());
        FileOutputStream outputStreamThree = new FileOutputStream(reader.readLine());

        int fileSize = inputStreamOne.available();
        int fileSizeThree = fileSize/2;
        int fileSizeTwo = fileSize - fileSizeThree;
        byte[] fileTwoBuffer = new byte[fileSizeTwo];
        byte[] fileThreeBuffer = new byte[fileSizeThree];

        int count = inputStreamOne.read(fileTwoBuffer);
        outputStreamTwo.write(fileTwoBuffer,0,count);

        int count2 = inputStreamOne.read(fileThreeBuffer);
        outputStreamThree.write(fileThreeBuffer,0,count2);

        inputStreamOne.close();
        outputStreamTwo.close();
        outputStreamThree.close();
    }
}