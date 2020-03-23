package Grow.Algorithmization.Decomposition;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskDecomposition03 {
    public static void main(String[] args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину стороны шестиуголника");
        int a = Integer.parseInt(rd.readLine());
        rd.close();
        System.out.println();
        areaHexagon(a);


    }
    public static void areaHexagon(int a){
        double areaTriangle;
        areaTriangle = (3 * Math.sqrt(3) * Math.pow(a,2))/2;
        double areaHex = Math.rint((areaTriangle * 6)*100)/100;
        System.out.printf("Площадь шестиугольника равна: %.2f %n", areaHex);
    }
}
