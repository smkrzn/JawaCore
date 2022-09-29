package Lesson_5;

import java.io.*;

public class Read_My_File {

    public AppData fileRead(File file) throws IOException {
        AppData a = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int i = 0;
            String line;
            String[][] arr = new String[30][30];
            while ((line = br.readLine()) != null) {
                String[] lineStr = line.split(";");
                arr[i] = lineStr;
                i++;
            }
            String[] header = arr[0];
            int [][] data = new int[arr.length-1][arr[0].length];
            for (int y = 1; y < i; y++) {
                for (int x = 0; x < header.length; x++){
                    data[y][x] = Integer.parseInt(arr[y][x]);
                }
            }
            a = new AppData(header,data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       return a;
    }
}
