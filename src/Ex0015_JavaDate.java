import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex0015_JavaDate {
    public void printDate1() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);
    }

    public void printDate2() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.ms");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);
    }

    public static void main(String[] args) {
        Ex0015_JavaDate javaDate = new Ex0015_JavaDate();
        javaDate.printDate1();
        javaDate.printDate2();
    }
}
