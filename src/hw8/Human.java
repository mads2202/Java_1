package hw8;

public class Human implements Action {
    String name;
    int maxRunDistance;
    int maxJumpHeight;

    public Human(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunLength() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public boolean run(int barrier) {
        if(barrier>this.maxRunDistance){
            System.out.println(getName()+ "  не смог пробежать дистанцию "+ barrier);
            return false;}
        else{
            System.out.println(getName()+" пробежал дистанцию "+ barrier);
            return true;}
    }

    @Override
    public boolean jump(int barrier) {
        if(barrier>this.maxJumpHeight){
            System.out.println(getName()+ "  не смог перепрыгнуть стенку высотой "+ barrier);
            return false;}
        else{
            System.out.println(getName()+" пререпрагнул стенку высотой "+ barrier);
            return true;}
    }
}
