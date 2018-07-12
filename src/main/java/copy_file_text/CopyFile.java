package copy_file_text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    private static void copyFile(File source, File taget) throws IOException {
        try {
            Files.copy(source.toPath(), taget.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input source file: ");
        String sourcepath = sc.nextLine();
        System.out.print("Input taget file: ");
        String tagetpath = sc.nextLine();

        File sourceFile = new File(sourcepath);
        File tagetFile = new File(tagetpath);

//        ./src/main/resources/sorce.txt
//        ./src/main/resources/sorce.txt

        try {
            copyFile(sourceFile, tagetFile);
            System.out.println("copy completed");
        } catch (IOException e) {
            System.out.println("can't not copy file");
            e.printStackTrace();
        }
    }
}
