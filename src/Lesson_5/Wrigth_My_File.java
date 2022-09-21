package Lesson_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Wrigth_My_File {

    public void seve(AppData data, File file) throws IOException{
        String[] header = data.getHeader();
        int [][] newData = data.getData();
        try (FileWriter fw = new FileWriter(file)){
            for (int i = 0; i < header.length; i++){
                fw.write(header[i]);
                fw.write(";");
            }
            for (int i = 0; i < newData.length; i++){
                fw.write("\n");
                for (int y = 0; y < newData[i].length; y++){
                    fw.write(String.valueOf(newData[i][y]));
                    if(y != (newData.length-1)) {
                        fw.write(";");
                    }
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
