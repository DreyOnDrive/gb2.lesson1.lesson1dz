package gb2.lesson1.lesson1dz;

import java.util.Arrays;

public class Team {

    final private String name;
    final private Animal [] animals;
    private boolean win = true;

    public Team(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals;
    }

    void showResults(){
        System.out.println("Объявление результатов");
        for (Animal animal : animals) {
            win = win & animal.isResult();
        }
        if (win == true){
            System.out.println("Команда " + name + " прошла");
        }else System.out.println("Команда " + name + " не прошла");
    }

    void printInformation (){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Команда " + name + " и её участники: " + Arrays.toString(animals);
    }
}
