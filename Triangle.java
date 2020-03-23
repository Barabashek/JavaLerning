public class Triangle {
    double area;
    int height;
    int lrngth;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] tg = new Triangle[4];
        while (x < 4){
            tg[x] = new Triangle();
            tg[x].height = (x+1)*2;
            tg[x].lrngth = x+4;
            tg[x].setArea();
            System.out.print("Triangle " + x + ", area");
            System.out.println(" = " + tg[x].area);
            x++;
        }
    }
    void setArea(){
        area = (height*lrngth)/2;
    }
}
