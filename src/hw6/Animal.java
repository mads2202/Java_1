package hw6;

public class  Animal {
    private String name;
    private int age;
    private String color;
    private static int counter=0;


    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        counter++;
    }
    public String run(int distance){
        return "Animal "+getName()+" run "+distance;
    }
    public String swim(int distance){
        return "Animal "+getName()+" swim "+distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCounter() {
        return counter;
    }


}
