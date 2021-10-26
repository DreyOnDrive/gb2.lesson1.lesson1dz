package gb2.lesson1.lesson1dz;

public class Monkey extends Animal {

    final private String name;
    private boolean result = true;

    public Monkey(String name) {
        this.name = name;
    }

    public void run (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 400){
            System.out.println("Обезьяна " + name + " не смогла пробежать дистанцию " + distance + " м.");
            result = result & false;
        }
        if (distance <= 400){
            System.out.println("Обезьяна " + name+ " пробежала дистанцию " + distance + " м.");
            result = result & true;
        }
    }

    public void swim (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 100){
            System.out.println("Обезьяна " + name + " не смогла проплыть дистанцию ");
            result = result & false;
        }
        if (distance <= 100){
            System.out.println("Обезьяна " + name + " проплыла " + distance + " м.");
            result = result & true;
        }
    }

    public void climb (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 5){
            System.out.println("Обезьяна " + name + " не смогла забраться на стену " + distance + " м.");
            result = result & false;
        }
        if (distance <= 5){
            System.out.println("Обезьяна " + name +  " смогла забраться на стену " + distance + " м.");
            result = result & true;
        }
    }

    public void jump (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 3){
            System.out.println("Обезьяна " + name + " не смогла перепрыгнуть яму " + distance + " м.");
            result = result & false;
        }
        if (distance <= 3){
            System.out.println("Обезьяна " + name +  " смогла перепрыгнуть яму " + distance + " м.");
            result = result & true;
        }
    }

    @Override
    public String toString() {
        return "Обезьяна " + name;
    }

    @Override
    public boolean isResult() {
        if (result == true){
            System.out.println("Обезьяна " + name + " прошла полосу препятствий");
        }else System.out.println("Обезьяна" + name + " не прошла полосу препятствий");
        return result;
    }
}
