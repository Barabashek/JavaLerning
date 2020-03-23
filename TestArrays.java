
public class TestArrays {
    public static void main(String[] args) {

        String[] islands = new String[4];
        int[] index = new int[4];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        islands[0] = "Bermudas";
        islands[1] = "Fiji";
        islands[2] = "Azores island";
        islands[3] = "Kosumel";

        int y = 0;
        int ref;
        while (y <4){

            ref = index[y];
            System.out.print("islands = ");
            System.out.println(islands[ref]);
            y++;
        }
    }
}
