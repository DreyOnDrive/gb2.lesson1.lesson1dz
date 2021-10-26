package gb2.lesson1.lesson1dz;

public class Wall extends Obstacle {

    final private String name;
    final private int length;

    public Wall(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return name + " высотой " + length +" м.";
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

}
