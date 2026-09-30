import java.io.*;

class FileOperations {
    public static void main(String[] args) throws Exception {
        File f = new File("sample.txt");

        if (f.createNewFile())
            System.out.println("File created successfully.");
        else
            System.out.println("File already exists.");

        FileWriter w = new FileWriter(f);
        w.write("Welcome to Java File Operations");
        w.close();

        BufferedReader r = new BufferedReader(new FileReader(f));
        String s;

        System.out.println("File contents:");
        while ((s = r.readLine()) != null)
            System.out.println(s);

        r.close();

        System.out.println("File exists: " + f.exists());
        System.out.println("File name: " + f.getName());
    }
}