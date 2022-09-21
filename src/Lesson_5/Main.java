package Lesson_5;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/Lesson_5/fileWright.csv");

        fileWright(file,"Hello");
        fileRead(file);
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

    static void fileRead(File file) throws IOException{
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            int i;
            do {
                i = fileInputStream.read();
                System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
