package gb2.lesson1.lesson1dz;

import java.util.Arrays;

public class Course {

    final private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    @Override
    public String toString() {
        return "Полоса препятствий состоит из следующих элементов: " + Arrays.toString(obstacles);
    }

    void printInformation() {
        System.out.println(this.toString());
    }

    public void trying(Obstacle[] obstacles, Animal[] animals){
        for (Animal animal : animals) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.getName() == "Яма") {
                    animal.jump(obstacle.getLength());
                }
                if (obstacle.getName() == "Вода"){
                    animal.swim(obstacle.getLength());
                }
                if (obstacle.getName() == "Стена"){
                    animal.climb(obstacle.getLength());
                }
                if (obstacle.getName() == "Трек" ){
                    animal.run(obstacle.getLength());
                }
            }
            System.out.println();
        }
    }
}
