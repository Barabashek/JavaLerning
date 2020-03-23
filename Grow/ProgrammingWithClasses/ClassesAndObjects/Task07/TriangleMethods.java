package Grow.ProgrammingWithClasses.ClassesAndObjects.Task07;

public class TriangleMethods {

    public int TrianglePerimetr(Triangle tr){
        return tr.getSideOne() + tr.getSideTwo() + tr.getSideThree();
    }
    public int TriangleAreaByGeron(Triangle tr){
       int halfPerimetr = TrianglePerimetr(tr) / 2;
       return (int) Math.sqrt(halfPerimetr * (halfPerimetr - tr.getSideOne())*(halfPerimetr - tr.getSideTwo())*(halfPerimetr - tr.getSideThree()));
    }
    public int TriangleArea(Triangle tr){
       int[] pointA = tr.getPointA();
       int[] pointB = tr.getPointB();
       int[] pointC = tr.getPointC();
       return Math.abs(((pointA[0] - pointC[0])*(pointA[1] - pointC[1])-(pointB[0]-pointC[0])*(pointB[1]-pointC[1]))/2);
    }
    public int[] MedianCrossPoints(Triangle tr){
        int[] pointA = tr.getPointA();
        int[] pointB = tr.getPointB();
        int[] pointC = tr.getPointC();

        int[] pointsToMedian = new int[2];
        pointsToMedian[0] = (pointA[0] + pointB[0] + pointC[0]) / 3;
        pointsToMedian[1] = (pointA[1] + pointB[1] + pointC[1]) / 3;

        return pointsToMedian;
    }
}
