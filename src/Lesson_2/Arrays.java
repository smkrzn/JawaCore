package Lesson_2;

public class Arrays {

    private final String [][] goodArray = {{ "3", "5", "1", "6"}, { "5", "2", "9", "7"}, { "8", "1", "9", "3"}, {"6", "4", "8", "9"}};
    private final String [][] shortArray = {{ "2", "6"}, { "5", "2"}, { "8", "3"}, {"6", "8", "9"}};
    private final String [][] badArray = {{ "1", "5", "1", "6"}, { "5", "два", "9", "7"}, { "8", "1", "9", "3"}, {"6", "4", "8", "9"}};

    public String[][] getGoodArray() {
        return goodArray;
    }

    public String[][] getShortArray() {
        return shortArray;
    }

    public String[][] getBadArray() {
        return badArray;
    }
}
