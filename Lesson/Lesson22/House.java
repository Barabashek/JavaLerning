package Lesson.Lesson22;

public class House implements Comparable<House> {
     private int area;
    private int price;
    private String city;
    private boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHasFurniture(boolean hasFurniture) {
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer("House{");
            sb.append("area=").append(area);
            sb.append(", price=").append(price);
            sb.append(", city='").append(city).append('\'');
            sb.append(", hasFurniture=").append(hasFurniture);
            sb.append('}');
        return sb.toString();
    }
    public int compareTo(House someHouse){
        return this.area - someHouse.area;
    }
}
