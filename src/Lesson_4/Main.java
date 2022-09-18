package Lesson_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] myArray = {"World", "Boll", "Aplle", "Roud", "Men", "Boll", "Run", "Sun", "Star", "Men", "Sea", "Men", "Cat",
                "Lime", "Sun", "Moon", "World"};

        ArrayList<String> myArrayList;
        HashSet<String> uniqueName;
        HashMap<String,Integer> repeat;
        Processing processing = new Processing();
        myArrayList = processing.arrayToList(myArray);
        uniqueName = processing.uniqueName(myArrayList);
        System.out.println(uniqueName);
        repeat = processing.repeat(myArrayList,uniqueName);
        for (Map.Entry<String,Integer> pair: repeat.entrySet()) {
            System.out.println(pair.getKey() + " повторов: " + pair.getValue());
        }

        Telefon_Numbers myDirectory = new Telefon_Numbers();
        myDirectory.add("Mike", 79009999920l);
        myDirectory.add("Elen", 79009209920l);
        myDirectory.add("Pit", 79009985920l);
        myDirectory.add("Mike", 79009563420l);
        myDirectory.add("Jane", 79009913762l);
        myDirectory.add("Sam", 79009998634l);
        myDirectory.add("Kate", 79009346770l);
        myDirectory.add("Pit", 79005559920l);

        String name = "Mike";
        myDirectory.get(name);

    }
}
