package gb2.lesson1.lesson1dz;

public class Dog extends Animal {

    final private String name;
    private boolean result = true;

    public Dog(String name) {
        this.name = name;
    }

    public void run (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 500){
            System.out.println("Собака " + name + " не смогла пробежать дистанцию " + distance + " м.");
            result = result & false;
        }
        if (distance <= 500){
            System.out.println("Собака " + name+ " пробежала дистанцию " + distance + " м.");
            result = result & true;
        }
    }

    public void swim (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 250){
            System.out.println("Собака " + name + " не смогла проплыть дистанцию ");
            result = result & false;
        }
        if (distance <= 250){
            System.out.println("Собака " + name + " проплыла " + distance + " м.");
            result = result & true;
        }
    }

    public void climb (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 2){
            System.out.println("Собака " + name + " не смогла забраться на стену " + distance + " м.");
            result = result & false;
        }
        if (distance <= 2){
            System.out.println("Собака " + name +  " смогла забраться на стену " + distance + " м.");
            result = result & true;
        }
    }

    public void jump (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 3){
            System.out.println("Собака " + name + " не смогла перепрыгнуть яму " + distance + " м.");
            result = result & false;
        }
        if (distance <= 3){
            System.out.println("Собака " + name +  " смогла перепрыгнуть яму " + distance + " м.");
            result = result & true;
        }
    }

    @Override
    public String toString() {
        return "Собака " + name;
    }

    @Override
    public boolean isResult() {
        if (result == true){
            System.out.println("Собака " + name + " прошла полосу препятствий");
        }else System.out.println("Собака " + name + " не прошла полосу препятствий");
        return result;
    }
}
