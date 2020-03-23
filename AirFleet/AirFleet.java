package AirFleet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AirFleet {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        }catch (IOException e){

        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputOnBoard = reader.readLine();
        int pass;
        if (inputOnBoard.equals("helicopter")){
            result = new Helicopter();
        } else if (inputOnBoard.equals("plane")){
            pass = Integer.parseInt(reader.readLine());
            result = new Plane(pass);
        }
        reader.close();

    }
}
