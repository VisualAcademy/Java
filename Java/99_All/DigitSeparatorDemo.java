import java.text.NumberFormat; 

public class DigitSeparatorDemo {
    public static void main(String[] args) {
        int dec = 1_000_000;
        System.out.println(dec); // 1000000

        NumberFormat formatter = NumberFormat.getInstance();
        System.out.println(formatter.format(dec)); // 1,000,000
    }
}
