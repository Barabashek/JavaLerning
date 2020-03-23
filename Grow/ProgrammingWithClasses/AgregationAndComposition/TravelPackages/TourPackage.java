package Grow.ProgrammingWithClasses.AgregationAndComposition.TravelPackages;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class TourPackage {
        private String country;
        private String city;
        private TypeTravelPackage ttp;
        private Transport transport;
        private TypeOfFood food;
        private int daysQuantity;
        private double price;

    public TourPackage(String country, String city, TypeTravelPackage ttp, Transport transport, TypeOfFood food, int daysQuantity, double price) {
        this.country = country;
        this.city = city;
        this.ttp = ttp;
        this.transport = transport;
        this.food = food;
        this.daysQuantity = daysQuantity;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TypeTravelPackage getTtp() {
        return ttp;
    }

    public void setTtp(TypeTravelPackage ttp) {
        this.ttp = ttp;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public void setFood(TypeOfFood food) {
        this.food = food;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(int daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
