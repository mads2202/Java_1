package hw6;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Animal("Animal",12,"black");
        System.out.println(animal.swim(100));
        System.out.println(animal.run(100));
        System.out.println(Animal.getCounter());

        Cat cat =new Cat("cat",12,"black");
        System.out.println(cat.swim(201));
        System.out.println(cat.run(201));
        System.out.println(Cat.getCounter());

        Animal dog =new Dog("Dog",12,"black");
        System.out.println(dog.swim(10));
        System.out.println(dog.run(600));
        System.out.println(Dog.getCounter());

        System.out.println(Animal.getCounter());

    }
}
