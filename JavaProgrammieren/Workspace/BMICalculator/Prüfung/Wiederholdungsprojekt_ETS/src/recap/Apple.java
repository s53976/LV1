package recap;

import java.util.Arrays;
import java.util.Objects;

public class Apple implements Comparable <Apple> {
    private String color;
    private int weight;


    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Apple o) {
        //Sortierung aufsteigend nach Gewicht
        //return Integer.compare(this.weight, o.weight);

        //Sortierung aufsteigend nach Color
        return this.color.compareTo(o.color);
    }
}
