package gb2.lesson1.lesson1dz;

public class Water extends Obstacle {

    final private String name;
    final private int length;

    public Water(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return name + " длиной " + length +" м.";
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

}
