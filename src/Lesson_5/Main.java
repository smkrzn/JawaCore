package Lesson_5;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/Lesson_5/fileWright.csv");

        fileWright(file,"Hello; Ball ;Cat\n111;222;444\n768;567;875");
        Read_My_File read_my_file = new Read_My_File();
        AppData data = read_my_file.fileRead(file);
        Wrigth_My_File wrigth_my_file = new Wrigth_My_File();
        String[] str = {"Dog", "Bull", "Pig"};
        int[][] nums = {{12,54,87},{89,45,29},{74,91,50}};
        AppData newData = new AppData(str,nums);
        wrigth_my_file.seve(newData,file);
    }

    static void fileWright(File file, String string) throws IOException{
        byte[] bytes = string.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            for (int i: bytes){
                fileOutputStream.write(i);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
