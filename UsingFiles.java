package io.com;

import java.io.*;

public class UsingFiles {

    public static void main(String[] args) {

        File newFile = new File("output.txt");

        if (!newFile.exists()){
            System.out.println("File does not exist!");
        } else {
            System.out.printf("File exists \n");

        }

        String fullPath = newFile.getAbsolutePath();
        System.out.println("and can be found here: \n" + fullPath);

        FileWriter writer;

        try
        {
            writer = new FileWriter(newFile);
            BufferedWriter buf = new BufferedWriter(writer);

            buf.write("This is text written by the programme \n");
            buf.write("The file can be be found here: " + newFile.getAbsolutePath() + "\n");

            buf.flush();

        }catch (IOException e) {
            System.err.println("Something went wrong!");

        }


        FileReader reader;

        try
        {
            reader = new FileReader(newFile);
            BufferedReader buf = new BufferedReader(reader);

            String firstLine = buf.readLine();
            String secondLine = buf.readLine();

            buf.close();

            System.out.println(firstLine + "\n" + secondLine + "\n");

        }catch (IOException e) {
            System.err.println("Something went wrong!");

        }

    }


}
