package tmge;

import java.io.*;
import java.lang.ProcessBuilder.Redirect;
import java.util.*;

public class TMGELoader {
    public static void main(String[] args) {
        File curDir = new File(".");
        List<File> jarFiles = Arrays.asList(curDir.listFiles()).stream().filter(file -> file.toString().endsWith(".jar")).toList();
        System.out.println("Select JAR to run: ");
        for (int i = 0; i != jarFiles.size(); i++) {
            System.out.println(i + " : " + jarFiles.get(i).toString());
        }
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        while (choice < 0 || choice >= jarFiles.size()) {
            System.out.println("Invalid choice!");
            System.out.println("Select JAR to run: ");
            choice = in.nextInt();
        }
        
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "--enable-preview", jarFiles.get(choice).toString());
        pb.redirectInput(Redirect.INHERIT);
        pb.redirectOutput(Redirect.INHERIT);
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
