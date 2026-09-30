import java.io.*;
import java.nio.file.*;

class IO_NIO_Demo {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("io.txt");
        fw.write("Hello from IO Stream");
        fw.close();

        FileReader fr = new FileReader("io.txt");
        int ch;
        System.out.println("IO Stream:");
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();

        Files.write(Paths.get("nio.txt"), "Hello from NIO Stream".getBytes());

        System.out.println("\nNIO Stream:");
        System.out.println(new String(Files.readAllBytes(Paths.get("nio.txt"))));
    }
}