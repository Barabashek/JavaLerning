package Lesson.Lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<House> houseArrays = new TreeSet<>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        houseArrays.add(firstHouse);
        houseArrays.add(secondHouse);
        houseArrays.add(thirdHouse);
        System.out.println("Sorted: ");
        for (House h : houseArrays){
            System.out.println(h);
        }

        System.out.println();

        ArrayList<House> arrayListHouse = new ArrayList<>();
        arrayListHouse.add(firstHouse);
        arrayListHouse.add(secondHouse);
        arrayListHouse.add(thirdHouse);

        //PriceComparator priceComparator = new PriceComparator();
        Comparator<House> priceComparator = Comparator.comparing(obj -> obj.getPrice());
        arrayListHouse.sort(priceComparator);
        System.out.println("Sorted: ");
        for (House s : arrayListHouse){
            System.out.println(s);
        }

        System.out.println();
        //NameComparator nameComparator = new NameComparator();
        Comparator<House> nameComparator = (o1, o2) -> o1.getCity().compareTo(o2.getCity());
        arrayListHouse.sort(nameComparator);
        System.out.println("Sorted: ");
        for (House n : arrayListHouse){
            System.out.println(n);
        }
    }
}
