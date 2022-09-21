package Lesson_5;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/Lesson_5/fileWright.csv");

        fileWright(file,"Hello; poh ;gir\n111;222;444\n768;567;875");
        Read_My_File read_my_file = new Read_My_File();
        AppData data = read_my_file.fileRead(file);
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
