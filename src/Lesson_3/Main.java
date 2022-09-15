package Lesson_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Aplle aplle = new Aplle();

        Box<Aplle> boxAplle1 = new Box<>(aplle, 5);
        Box<Aplle> boxAplle2 = new Box<>(aplle, 9);
        Box<Aplle> boxAplle3 = new Box<>(aplle, 5);
        Box<Aplle> boxAplle4 = new Box<>(aplle, 3);

        Orange orange = new Orange();

        Box<Orange> boxOrange1 = new Box<>(orange, 9);
        Box<Orange> boxOrange2 = new Box<>(orange, 2);
        Box<Orange> boxOrange3 = new Box<>(orange, 6);
        Box<Orange> boxOrange4 = new Box<>(orange, 7);

        boxAplle2.compare(boxOrange3);
        boxAplle2.pourOver(boxAplle1.getBoxList());
    }
}
