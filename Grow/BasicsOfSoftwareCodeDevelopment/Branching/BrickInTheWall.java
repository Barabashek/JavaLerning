package Grow.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class BrickInTheWall {
    public static void main(String[] args) {
        int lengthHoleA;
        int highHoleB;

        int x; //длина кирпича
        int y; //высота кирпича
        int z; //ширина кирпича

        System.out.print("Введите длину отверстия: ");
        Scanner scanner = new Scanner(System.in);
        lengthHoleA = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите высоту отверстия: ");
        highHoleB = Integer.parseInt(scanner.nextLine());
        System.out.printf("Длина отверстия: %d", lengthHoleA);
        System.out.printf("\nВысота отверстия: %d", highHoleB);
        System.out.println();
        System.out.print("Введите параметры кирпича: ");
        x = Integer.parseInt(scanner.nextLine());
        y = Integer.parseInt(scanner.nextLine());
        z = Integer.parseInt(scanner.nextLine());
        System.out.printf("\nДлина кирпича: %d, высота кирпича: %d, ширина кирпича: %d", x,y,z);
        int holeArea = lengthHoleA * highHoleB;
        System.out.printf("\nПлощадь отверстия: %d", holeArea);
        int brickAreaFirst = x * y;
        int brickAreaSecond = y * z;
        System.out.printf("\nПлощадь кирпича в горизонтальной проекции: %d, площадь кирпича в фронтальной проекции: %d", brickAreaFirst, brickAreaSecond);
        if (isFit(holeArea, brickAreaFirst, brickAreaSecond)){
            System.out.println("\nКирпич пройдет в отверстие!");
        } else {
            System.out.println("\nКирпич не пройдет, отверстие слишком мало!");
        }
    }
    public static boolean isFit(int holeArea, int brickAreaFirst, int brickAreaSecond){
        if (holeArea > brickAreaFirst || holeArea > brickAreaSecond) return true;
        return false;
    }
}
