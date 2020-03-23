public class OrderOfLoadValue {

    static {
        init();
    }

    static {
    System.out.println("Static block");
}

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public OrderOfLoadValue() {
        System.out.println("OrderOfLoadValue constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        OrderOfLoadValue s = new OrderOfLoadValue();
    }

    public static void printAllFields(OrderOfLoadValue obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
