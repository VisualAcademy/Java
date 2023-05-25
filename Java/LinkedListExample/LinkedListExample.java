import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruitBasket = new LinkedList<>();

        fruitBasket.add("사과");
        fruitBasket.add("바나나");
        fruitBasket.add("체리");
        fruitBasket.add("대추");

        System.out.println(fruitBasket);

        fruitBasket.addFirst("아보카도");
        fruitBasket.addLast("살구");

        System.out.println(fruitBasket);
        
        fruitBasket.removeFirst();
        fruitBasket.removeLast(); 

        System.out.println(fruitBasket);

        String first = fruitBasket.getFirst();
        String last = fruitBasket.getLast(); 

        System.out.println(first);
        System.out.println(last);
    }
}
