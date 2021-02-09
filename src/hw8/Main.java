package hw8;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall(3);
        Wall wall2 = new Wall(5);
        Wall wall3 = new Wall(7);
        Treadmill treadMill1 = new Treadmill(1000);
        Treadmill treadMill2 = new Treadmill(2000);
        Treadmill treadMill3 = new Treadmill(3000);
        Barrier[] barriers = {wall1, treadMill1, wall2, treadMill2, wall3, treadMill3};
        Human human = new Human("Human", 2500, 5);
        Cat cat = new Cat("Cat", 1500, 9);
        Robot robot = new Robot("Robot", 5000, 15);
        Action[] actions = {human, cat, robot};

        for (int i = 0; i < actions.length; i++) {
            label:
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] instanceof Wall) {
                    if (!actions[i].jump(barriers[j].heightOrDistance))
                        break label;
                }
                if (barriers[j] instanceof Treadmill) {
                    if (!actions[i].run(barriers[j].heightOrDistance))
                        break label;
                }
            }


        }


    }

}
