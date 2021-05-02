package geekbrains.dubovik.java.lesson1.fruitsboxing;

/**
 * abstract class - из-за запрета смешивать фрукты по условиям задачи
 */
public abstract class Fruits {
    float weight;

    public Fruits(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
