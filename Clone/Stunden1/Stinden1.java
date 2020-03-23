package Clone.Stunden1;

class User implements Cloneable{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public User clone() throws CloneNotSupportedException{
        return (User)super.clone();
    }
}

public class Stinden1 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Boris");
        user.setAge(25);

        System.out.println("Data before clone: " + user.getName() + " - " + user.getAge() + " years");

        User clone;
        try {
            clone = user.clone();
            clone.setName("Razer");
            clone.setAge(30);
            System.out.println("Replicant after change data: " + clone.getName() + " - " + clone.getAge() + " years");
        } catch (CloneNotSupportedException e){
            System.out.println("Cloning is impossible");
        }
        System.out.println("Original after action with clone: " + user.getName() + " - " + user.getAge() + " years");
    }
}
