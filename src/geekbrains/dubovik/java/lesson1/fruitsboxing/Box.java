package geekbrains.dubovik.java.lesson1.fruitsboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <F extends Fruits> {
    ArrayList<F> fruitBox;

    public Box(F... fruit) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruit));
    }

    public ArrayList<F> getFruitBox() {
        return fruitBox;
    }

    public float boxWeight() {
        float weight = 0.0f;
        for (F fruit : fruitBox) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compareBox(Box another) {
        return (this.boxWeight() == another.boxWeight());
    }

    public void addFruit(F fruit) {
        this.fruitBox.add(fruit);
    }

    public void transferFruits (Box<F> anotherBox) {
        anotherBox.getFruitBox().addAll(this.fruitBox);
        fruitBox.clear();
    }
}
