package Lesson.Lesson12;


public class Parcel2 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            public String readLabel(){return label;}
        };
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        Destination d = p.destination("Tanzany");
    }
}
