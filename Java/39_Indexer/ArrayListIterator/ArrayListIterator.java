import java.util.ArrayList; 
import java.util.Iterator; 

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Iterator it = colors.iterator();
        while (it.hasNext()) {
            String color = (String)it.next();
            System.out.println(color); // R, G, B
        }
    }
}
