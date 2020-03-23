package Coffee;

public class MakeCoffee {
    public static void main(String[] args) {
        LatteMaker latteMaker = new LatteMaker();
        TeaMaker teaMaker = new TeaMaker();

        latteMaker.makeDrink();
        System.out.println();
        teaMaker.makeDrink();
    }
}
