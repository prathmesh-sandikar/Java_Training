package com.harman.batch4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCreate {

    public static void main(String[] args) {
//        String data = "Welcome to Java Programming";

        try {

            FileInputStream file = new FileInputStream("Sample.txt");
            int i = 0;
            while ((i = file.read()) != -1) {
                System.out.println((char) i);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
//            byte b[] = data.getBytes();
//            file.write(b);
//            file.close();
//            System.out.println("File created successfully");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//}