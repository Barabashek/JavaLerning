package Grow.ProgrammingWithClasses.ClassesAndObjects.Task07;

// Описать класс, представляющий треугольник. Предусмотреть методы
// для создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Triangle {

    private int sideOne;
    private int sideTwo;
    private int sideThree;

    private int[] pointA;
    private int[] pointB;
    private int[] pointC;


    public Triangle(int[] pointA, int[] pointB, int[] pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.sideOne = distancePointToPoint(pointA[0], pointB[0], pointA[1], pointB[1]);
        this.sideTwo = distancePointToPoint(pointB[0], pointC[0], pointB[1], pointC[1]);
        this.sideThree = distancePointToPoint(pointC[0], pointA[0], pointC[1], pointA[1]);
    }

    public int distancePointToPoint(int x1, int x2, int y1, int y2){
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    public void setPointA(int[] pointA) {
        this.pointA = pointA;
    }

    public void setPointB(int[] pointB) {
        this.pointB = pointB;
    }

    public void setPointC(int[] pointC) {
        this.pointC = pointC;
    }

    public int[] getPointA() {
        return pointA;
    }

    public int[] getPointB() {
        return pointB;
    }

    public int[] getPointC() {
        return pointC;
    }
}
