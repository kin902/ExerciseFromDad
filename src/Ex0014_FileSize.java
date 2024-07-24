import java.io.File;

public class Ex0014_FileSize {
    public static void main(String[] args) {
        File myObj = new File("/Users/kin/Documents/Arduino/HappyBirthDay");
        System.out.println("/Documents/Arduino/HappyBirthDay.txt: " + myObj.length());
        myObj = new File("/Documents/Zalo Received Files");
        System.out.println("/Documents/Zalo Received Files: " + myObj.length());
    }
}
