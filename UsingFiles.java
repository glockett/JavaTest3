package io.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

        try {
            FileReader readme = new FileReader(newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }


        File dir = new File("src/");
        File [] files = dir.listFiles();
        for (File f : files){

            System.out.println(f.getName());
        }

        List<String> myStrings = new ArrayList<String>();

        myStrings.add("Hello");
        myStrings.add("World");
        myStrings.add("We");
        myStrings.add("are");
        myStrings.add("Saint");
        myStrings.add("Helens");
        myStrings.add("RLFC");

        for (int i = 0; 1 < myStrings.size(); i++){

            System.out.println(myStrings.get(i) + "");
        }

        for (String string : myStrings) {

            System.out.println(string + "");
        }

    }







}
