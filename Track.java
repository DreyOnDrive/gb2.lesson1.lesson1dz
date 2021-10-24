package gb2.lesson1.lesson1dz;

public class Track extends Obstacle {

    final private String name;
    final private int length;

    public Track(String name, int length) {
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
