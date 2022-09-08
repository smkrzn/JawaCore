package Lesson_2;

public class Processing {

    public int numsSumm(String[][] array) throws MyArraySizeException, MyArrayDataException{
        checkValue(array);
        int[][] myArray = new int[4][4];
        int summ = 0;
        int i =0;
        int y =0;
        try {
            for ( i = 0; i < 4; i++){
                for ( y = 0; y < 4; y++){
                    myArray[i][y] = Integer.parseInt(array[i][y]);
                    summ += myArray[i][y];
                }
            }
        } catch (NumberFormatException e){
            throw new MyArrayDataException("Ошибка значения в ячейке " + i + ":" + y);
        }
        return summ;
    }

    static void checkValue (String [][] array) throws MyArraySizeException{
        for (int i = 0; i < 4; i++){
            if(array.length != 4 || array[i].length != 4) throw new  MyArraySizeException();
        }
    }



}
