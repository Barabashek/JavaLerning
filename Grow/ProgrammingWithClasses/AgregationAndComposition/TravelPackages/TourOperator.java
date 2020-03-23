package Grow.ProgrammingWithClasses.AgregationAndComposition.TravelPackages;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TourOperator {
    private String tourOperatorName;
    private List<TourPackage> tourPackages;
    private List<Client> clients;

    public TourOperator(String tourOperatorName) {
        this.tourOperatorName = tourOperatorName;
        tourPackages = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public String getTourOperatorName() {
        return tourOperatorName;
    }

    public void setTourOperatorName(String tourOperatorName) {
        this.tourOperatorName = tourOperatorName;
    }

    public List<TourPackage> getTourPackages() {
        return tourPackages;
    }

    public void setTourPackages(List<TourPackage> tourPackages) {
        this.tourPackages = tourPackages;
    }

    public void addTourPackage(TourPackage tour){
        tourPackages.add(tour);
    }

    public void addClient(Client client, TourPackage tour){
        client.setTourPackage(tour);
        clients.add(client);
    }
    public ArrayList<TourPackage> choiceTourPackageType(TypeTravelPackage ttp){
        ArrayList<TourPackage> packages = tourPackages.stream().filter(tour -> tour.getTtp().equals(ttp)).collect(Collectors.toCollection(ArrayList::new));
        return packages;
    }
    public ArrayList<TourPackage> choiceMoreTourPackage(Transport transport){
        ArrayList<TourPackage> packages = tourPackages.stream().filter(tour -> tour.getTransport().equals(transport)).collect(Collectors.toCollection(ArrayList::new));
        return packages;
    }
    public ArrayList<TourPackage> choiceMoreTourPackage(Transport transport, TypeOfFood food){
        ArrayList<TourPackage> packages = tourPackages.stream().filter(tour -> tour.getTransport().equals(transport) && tour.getFood().equals(food)).collect(Collectors.toCollection(ArrayList::new));
        return packages;
    }
    public ArrayList<TourPackage> choiceMoreTourPackage(Transport transport, TypeOfFood food, int days){
        ArrayList<TourPackage> packages = tourPackages.stream().filter(tour -> tour.getTransport().equals(transport) && tour.getFood().equals(food) &&
                tour.getDaysQuantity() >= days).collect(Collectors.toCollection(ArrayList::new));
        return packages;
    }

    public ArrayList<TourPackage> choiceMoreTourPackage(int days){
        ArrayList<TourPackage> packages = tourPackages.stream().filter(tour -> tour.getDaysQuantity() >= days).collect(Collectors.toCollection(ArrayList::new));
        return packages;
    }
    public static void tourToString(ArrayList<TourPackage> packages){
        if (packages.size() == 0){
            System.out.println("List is empty");
            return;
        }
        for (TourPackage tour : packages){
            System.out.printf("For travel to: %s, %s, type package: %s, type transport: %s, food: %s, days: %d, price: %.2f USD \n",
                    tour.getCountry(), tour.getCity(), tour.getTtp(), tour.getTransport(), tour.getFood(), tour.getDaysQuantity(), tour.getPrice());
        }
    }
    public void sortByPrice(){
        tourPackages.sort(Comparator.comparing(TourPackage::getPrice));
    }
    public void sotrByDays(){
        tourPackages.sort(Comparator.comparing(TourPackage::getDaysQuantity));
    }
    public void sortByPrice(ArrayList<TourPackage> tours){
        tours.sort(Comparator.comparing(TourPackage::getPrice));
    }
    public void sortByDays(ArrayList<TourPackage> tours){
        tours.sort(Comparator.comparing(TourPackage::getDaysQuantity));
    }
}
