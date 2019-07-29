import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}