package org.fasttrack.curs11.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFiles {

    public static void main(String[] args) throws IOException {
//        File myFile = new File("C:\\Users\\Denis\\IdeaProjects\\Won12-Curs11\\src\\my-test-file.txt");
//        File myFile = new File("curs11.txt");
        FileReader myFileReader = new FileReader("files/curs11.txt");
        Scanner scanner = new Scanner(myFileReader);

        //java does autoboxing == conversie automata == int + Integer
        int myInt = 13;
        Integer fromString = Integer.valueOf("34");
        System.out.println(myInt + fromString);
        double myDouble = 34.4d;
        Double doubleFromString = Double.valueOf("13.4");
        System.out.println(myDouble + doubleFromString);

        Boolean myBoolean = false;

        List<Integer> fromFile = new ArrayList<>();

        while (scanner.hasNextLine()) {
            int liniaCurenta = scanner.nextInt();
            fromFile.add(liniaCurenta);
            System.out.println("FROM FILE=" + liniaCurenta);
        }


        System.out.println("Size of list is: " + fromFile.size());
        int sum = 0;
        for (int numarCurent: fromFile) {
            sum += numarCurent;
        }
        System.out.println("SUM is: " + sum);

        //set append to true.
        FileWriter writer = new FileWriter("files/curs11.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        writer.write("\n");
        writer.append(String.valueOf(sum));
        writer.flush();
        //flushing
    }
}
