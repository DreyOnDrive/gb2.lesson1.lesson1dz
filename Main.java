package gb2.lesson1.lesson1dz;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Борис");
        Animal dog = new Dog("Мухтар");
        Animal monkey = new Monkey("Тарзан");
        Animal snake = new Snake("Джанго");
        Animal [] animals = {cat, dog, monkey, snake};

        Obstacle pit = new Pit("Яма", 0);
        Obstacle wall = new Wall("Стена", 1);
        Obstacle water = new Water("Вода", 0);
        Obstacle track = new Track("Трек", 50);
        Obstacle [] obstacles = {pit, wall, water, track};

        Team team = new Team("Зоопарк № 7", animals);
        Course course = new Course(obstacles);

        team.printInformation();
        course.printInformation();
        course.trying(obstacles, animals);
        team.showResults();
    }
}
