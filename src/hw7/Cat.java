package hw7;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        int wasFood=plate.getFood();
            plate.decreaseFood(appetite);
            if (plate.getFood()<wasFood) {
                satiety = true;
                System.out.println("Кот "+ getName() + " наелся");
            }else {
                System.out.println("Кот "+ getName()+" не поел, для него слишком мало еды. Он кушает " +appetite +
                        " единиц еды. А в тарелке осталось только "+ plate.getFood() +" единиц еды.");
            }

        }


    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

}


