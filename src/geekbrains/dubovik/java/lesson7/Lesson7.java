package geekbrains.dubovik.java.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        TestingClass.start(ClassForTestFirst.class);
        System.out.println("Теперь второй файл...");
        TestingClass.start(ClassForTestSecond.class);
    }
}
