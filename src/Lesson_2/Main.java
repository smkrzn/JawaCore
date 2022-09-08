package Lesson_2;

public class Main {

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        Processing processing = new Processing();
        String[][] array = new String[4][4];
        int i = 0;
        array = arrays.getGoodArray();      // правильный массив
    //    array = arrays.getShortArray();     // массив с неправильным размером
    //    array = arrays.getBadArray();     // массив с неправильным содержимым
        try {
            i = processing.numsSumm(array);
            System.out.println("Сумма массива " + i);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }


    }
}
