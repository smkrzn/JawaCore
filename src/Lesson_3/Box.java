package Lesson_3;

import java.util.ArrayList;

public class Box < B extends Frut > {

    private B weight;
    private B quantity;
    private  Float massa;

    public Float Box(B weight, B quantity) {
        massa = weight.floatValue() * quantity.floatValue();
        return massa;
    }



}
