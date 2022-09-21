package Lesson_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Processing {

    public ArrayList<String> arrayToList (String[] array){
        ArrayList<String> newArrayList = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i ++){
            newArrayList.add(array[i]);
        }
        return newArrayList;
    }

    public HashSet<String> uniqueName (ArrayList<String> arrayList){
        HashSet<String> uniqueName = new HashSet<>();
        for (String a: arrayList){
            uniqueName.add(a);
        }
        return uniqueName;
    }

    public HashMap<String,Integer> repeat(ArrayList<String> generalList, HashSet<String> uniqueList){
        HashMap<String,Integer> repeat = new HashMap<>();
        for (String b: uniqueList){
            Integer i = 0;
            for (String c: generalList){
                if(b==c){
                    i++;
                }
            }
            repeat.put(b,i);
        }
        return repeat;
    }
}
