package Grow.BasicsOfSoftwareCodeDevelopment.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the values of two angles of triangle: ");
        int firstAngle = Integer.parseInt(reader.readLine());
        int secondAngle = Integer.parseInt(reader.readLine());
        System.out.printf("First angle = %d, second angle = %d", firstAngle, secondAngle);
        System.out.println();

        if (firstAngle > 0 && firstAngle <= 90 && secondAngle > 0 && secondAngle < 90 ||
                firstAngle > 0 && firstAngle < 90 && secondAngle > 0 && secondAngle <= 90){
            int summAngle = firstAngle + secondAngle;
            int thirdAngle = 180 - summAngle;
            System.out.printf("Third angle = %d", thirdAngle);
            System.out.println();
            if (180 - summAngle == 90){
                System.out.println("Right Triangle");
            } else if ((180 - summAngle) < 0){
                System.out.println("Triangle does not exist");
            }
        }
    }
}
