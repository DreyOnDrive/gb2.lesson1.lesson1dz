package gb2.lesson1.lesson1dz;

public class Cat extends Animal {

    final private String name;
    private boolean result = true;

    public Cat(String name) {
        this.name = name;
    }

    public void run (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 300){
            System.out.println("Кошка " + name + " не смогла пробежать дистанцию " + distance + " м.");
            result = result & false;
        }
        if (distance <= 300){
            System.out.println("Кошка " + name + " пробежала дистанцию " + distance + " м.");
            result = result &true;
        }
    }

    public void swim (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 0){
            System.out.println("Кошка " + name + " не умеет плавать ");
            result = result & false;
        }
        if (distance == 0){
            System.out.println("Кошка " + name + " преодолела водное препятствие " + distance + " м.");
            result = result & true;
        }
    }

    public void climb (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 3){
            System.out.println("Кошка " + name + " не смогла забраться на стену " + distance + " м.");
            result = result & false;
        }
        if (distance <= 3){
            System.out.println("Кошка " + name +  " смогла забраться на стену " + distance + " м.");
            result = result & true;
        }
    }

    public void jump (int distance) {
        if (distance < 0){
            System.out.println("Дистанция бывает только положительным числом");
        }
        if (distance > 2){
            System.out.println("Кошка " + name + " не смогла перепрыгнуть яму " + distance + " м.");
            result = result & false;
        }
        if (distance <= 2){
            System.out.println("Кошка " + name +  " смогла перепрыгнуть яму " + distance + " м.");
            result = result & true;
        }
    }

    public void printInformation (){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
    @Override
    public boolean isResult() {
        if (result == true){
            System.out.println("Кошка " + name + " прошла полосу препятствий");
        }else System.out.println("Кошка " + name + " не прошла полосу препятствий");
        return result;
    }
}
