package JavaTest;

import java.io.*;

public class FileWriting {
    static String S = "";

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            FileWriting.S = FileWriting.S + String.valueOf(i)+"\n";
        }
        writeFile1(FileWriting.S);
    }

    public static void writeFile1(String text) throws IOException {
        File myObj = new File("filename.txt");
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write(text);
        myWriter.close();
    }
}
