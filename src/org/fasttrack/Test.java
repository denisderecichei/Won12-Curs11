package org.fasttrack;

import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(new FileReader("C:\\Users\\Denis\\IdeaProjects\\Won12-Curs11\\src\\org\\fasttrack\\curs11.txt"));
        Scanner scanner = new Scanner(new File("curs11.txt"));
        String allContentConcatenated = "";
        while (scanner.hasNext()) {
            allContentConcatenated = allContentConcatenated.concat(scanner.nextLine() + " ");
        }
        System.out.println(allContentConcatenated);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Denis\\IdeaProjects\\Won12-Curs11\\src\\org\\fasttrack\\curs11.txt", true));
        writer.append(' ');
        writer.append(allContentConcatenated);
        writer.flush();
        writer.close();

        BufferedWriter newWriter = new BufferedWriter(new FileWriter("files/output.txt"));
        newWriter.write(allContentConcatenated);
        newWriter.flush();
    }
}
