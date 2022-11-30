package fileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File obj = new File("./resources/RRIT");
        if(obj.mkdir()){
            System.out.println("Created: " + obj.getName());
        }
        else {
            System.out.println("Already Exists");
        }
    }
}
