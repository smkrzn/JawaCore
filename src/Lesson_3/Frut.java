package Lesson_3;

public abstract class Frut extends Number{

    private Float quantity;
    private Float weight;
    //private String name = new String();

    public Frut(Float quantity, Float weight) {
        this.quantity = quantity;
        this.weight = weight;
    }

    public Float getQuantity() {
        return quantity;
    }

    public Float getWeight() {
        return weight;
    }

}
