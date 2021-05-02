package geekbrains.dubovik.java.lesson1.fruitsboxing;

public class FruitsBoxing {

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());
//        Box<Fruits> crazyMix = new Box<>(new Apple(), new Orange(), new Fruits(2.0f)); нам запретили смешивать

        System.out.println(appleBox1.boxWeight());
        System.out.println(appleBox2.boxWeight());
        System.out.println(orangeBox.boxWeight());

        System.out.println(appleBox1.compareBox(orangeBox));
        System.out.println(appleBox1.compareBox(appleBox2));

        appleBox2.addFruit(new Apple());
        System.out.println(appleBox1.compareBox(appleBox2));

        appleBox1.transferFruits(appleBox2);
        System.out.println(appleBox1.boxWeight());
        System.out.println(appleBox2.boxWeight());
    }
}
