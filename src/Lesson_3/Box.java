package Lesson_3;

import java.util.ArrayList;

public class Box < B extends Frut > {

    private B weight;
    private Integer quantity;
    private ArrayList<B> boxList;

    public Box(B weight, Integer quantity) {
        this.weight = weight;
        this.quantity = quantity;
        ArrayList<B> bArrayList = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            bArrayList.add(weight);
        }
        this.boxList = bArrayList;
    }

    public Float getWeightBox() {
        Float result = 0f;
        for (B c: getBoxList()) {
            if (c != null) {
                Float massa = c.getWeight();
                result += massa;
            }
        }
        return result;
    }

    public void pourOver(ArrayList<B> boxIn){
        boxList.addAll(boxIn);
        boxIn.clear();
    }

    public boolean compare(Box c){
        float a = getWeightBox();
        float b = c.getWeightBox();
        if( a == b){
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<B> getBoxList() {
        return boxList;
    }

}
