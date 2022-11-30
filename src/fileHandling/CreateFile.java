package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("./resources/RRIT/New.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("Created: " + obj.getName());
            } else {
                System.out.println("File Exists");
            }
        }
        catch (IOException e) {
            System.out.println("Some error...!!!");
        }
    }
}
