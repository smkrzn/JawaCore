package Lesson_5;

import java.io.*;

public class Read_My_File {

    static void fileRead(File file) throws IOException {

        try (FileReader  fileReader = new FileReader(file)){
            int i;
            do {
                i = fileReader.read();
                if ((char) i !=';')


                System.out.println((char) i);
            } while ((char) i != '\n' );
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
