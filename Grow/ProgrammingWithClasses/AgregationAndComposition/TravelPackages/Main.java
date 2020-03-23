package Grow.ProgrammingWithClasses.AgregationAndComposition.TravelPackages;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TourOperator operator = new TourOperator("Pegas");

        Client client = new Client("Sam", "Brown");

        operator.addTourPackage(new TourPackage("Brazil", "San-Paulo", TypeTravelPackage.RECREATION, Transport.SHIP, TypeOfFood.ALL_INCLUSIVE, 14, 2500.00));
        operator.addTourPackage(new TourPackage("Brazil", "Rio-De-Janeiro", TypeTravelPackage.EXCURSIONS, Transport.BUS, TypeOfFood.BREAKFAST, 10, 2200.00));
        operator.addTourPackage(new TourPackage("Brazil", "Salvador", TypeTravelPackage.CRUISE, Transport.SHIP, TypeOfFood.ALL_INCLUSIVE, 20, 3000.00));
        operator.addTourPackage(new TourPackage("Italy", "Milan", TypeTravelPackage.SHOPPING, Transport.PLANE, TypeOfFood.NOT_ENCLUDED, 7, 3200.00));
        operator.addTourPackage(new TourPackage("Italy", "Roma", TypeTravelPackage.EXCURSIONS, Transport.AUTO, TypeOfFood.BREAKFAST, 10, 2800.00));
        operator.addTourPackage(new TourPackage("Austria", "Innsbruck", TypeTravelPackage.TREATMENT, Transport.TRAIN, TypeOfFood.ALL_INCLUSIVE, 15, 4500.00));
        operator.addTourPackage(new TourPackage("Austria", "Vienna", TypeTravelPackage.EXCURSIONS, Transport.BUS, TypeOfFood.NOT_ENCLUDED, 12, 3500.00));

        System.out.println("Choice by type travel: Recreation");
        ArrayList<TourPackage> packageByRecreation = operator.choiceTourPackageType(TypeTravelPackage.EXCURSIONS);
        TourOperator.tourToString(packageByRecreation);

        System.out.println();
        System.out.println("Choice by transport type: Bus");
        ArrayList<TourPackage> packageByBus = operator.choiceMoreTourPackage(Transport.BUS);
        operator.sortByDays(packageByBus);
        TourOperator.tourToString(packageByBus);

        System.out.println();
        System.out.println("Choice by transport type: Ship; food: All inclusive");
        ArrayList<TourPackage> morePackages = operator.choiceMoreTourPackage(Transport.SHIP, TypeOfFood.ALL_INCLUSIVE);
        operator.sortByPrice(morePackages);
        TourOperator.tourToString(morePackages);

        System.out.println();
        System.out.println("Choice y transport type: Ship, food: All inclusive, days: 10");
        morePackages = operator.choiceMoreTourPackage(Transport.SHIP, TypeOfFood.ALL_INCLUSIVE, 10);
        operator.sortByPrice(morePackages);
        TourOperator.tourToString(morePackages);

        operator.addClient(client, morePackages.get(1));
    }
}
