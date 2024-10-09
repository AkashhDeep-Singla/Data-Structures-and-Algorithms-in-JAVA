package Practice.FileHandle;

import java.io.*;

public class ReadWrite {
    static void appendFiles(String f1, String f2, String f3)
    {
        try{
            FileInputStream file1 = new FileInputStream(f1);
            FileInputStream file2 = new FileInputStream(f2);
            FileOutputStream file3 = new FileOutputStream(f3);
            int temp=0;
            while((temp = file1.read()) != -1){
                file3.write((byte)temp);
            }
            file3.write((byte)'\n');
            while((temp = file2.read()) != -1){
                file3.write((byte)temp);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

    }
}
