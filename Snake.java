package gb2.lesson1.lesson1dz;

public class Snake extends Animal {

    final  private String name;
    private boolean result = true;

    public Snake(String name) {
        this.name = name;
    }

    public void run (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 50){
            System.out.println("Змея " + name + " не смогла пробежать дистанцию " + distance + " м.");
            result = result & false;
        }
        if (distance <= 50){
            System.out.println("Змея " + name+ " пробежала дистанцию " + distance + " м.");
            result = result & true;
        }
    }

    public void swim (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 50){
            System.out.println("Змея " + name + " не смогла проплыть дистанцию " + distance + " м.");
            result = result & false;
        }
        if (distance <= 50){
            System.out.println("Змея " + name + " проплыла " + distance + " м.");
            result = result & true;
        }
    }

    public void climb (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 2){
            System.out.println("Змея " + name + " не смогла забраться на стену " + distance + " м.");
            result = result & false;
        }
        if (distance <= 2){
            System.out.println("Змея " + name +  " смогла забраться на стену " + distance + " м.");
            result = result & true;
        }
    }

    public void jump (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 0){
            System.out.println("Змея " + name + " не умеет прыгать");
            result = result & false;
        }
        if (distance == 0){
            System.out.println("Змея " + name +  " смогла перепрыгнуть яму " + distance + " м.");
            result = result & true;
        }
    }

    @Override
    public String toString() {
        return "Змея " + name;
    }

    @Override
    public boolean isResult() {
        if (result == true){
            System.out.println("Змея " + name + " прошла полосу препятствий");
        }else System.out.println("Змея " + name + " не прошла полосу препятствий");
        return result;
    }
}
