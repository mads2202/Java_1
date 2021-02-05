package hw7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(40);
        Cat cat1 = new Cat("Ракета", 12);
        Cat cat2= new Cat("Персик", 10);
        Cat cat3= new Cat("Бусинка", 5);
        Cat cat4=new Cat("Жора", 15);
        Cat cat5=new Cat("Кекс",8);
        Cat[] cats ={cat1,cat2,cat3,cat4,cat5};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].isSatiety());

        }
        plate.addFood(5);
        plate.info();
    }
}
