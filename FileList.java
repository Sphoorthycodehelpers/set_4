import java.io.*;

public class FileList {

    public void traverse(String path) {
        File root = new File(path);
        File[] files = root.listFiles();

        if (files == null) {
            System.out.println("Directory is empty or cannot be accessed.");
            return;
        }

        System.out.println("Listing contents of directory: " + root.getAbsolutePath());
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("Directory: " + f.getName());
            } else {
                System.out.println("File: " + f.getName());
            }
        }
    }

    public static void main(String[] args) {
        //String downloadsDirectory = System.getProperty("user.home") + File.separator + "Downloads";
        FileList fileList = new FileList();
        fileList.traverse("students_data");
    }
}
