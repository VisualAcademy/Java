import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 인스턴스를 생성합니다.
        LinkedList<String> fruitBasket = new LinkedList<>();

        // LinkedList에 과일을 추가합니다.
        fruitBasket.add("사과");
        fruitBasket.add("바나나");
        fruitBasket.add("체리");
        fruitBasket.add("대추");

        System.out.println("원본 LinkedList: " + fruitBasket);

        // 첫 번째 위치에 과일을 추가합니다.
        fruitBasket.addFirst("아보카도");

        // 마지막 위치에 과일을 추가합니다.
        fruitBasket.addLast("살구");

        System.out.println("과일을 추가한 후 LinkedList: " + fruitBasket);

        // 첫 번째 위치의 과일을 제거합니다.
        fruitBasket.removeFirst();

        // 마지막 위치의 과일을 제거합니다.
        fruitBasket.removeLast();

        System.out.println("과일을 제거한 후 LinkedList: " + fruitBasket);

        // 첫 번째 위치의 과일을 가져옵니다.
        String firstFruit = fruitBasket.getFirst();

        // 마지막 위치의 과일을 가져옵니다.
        String lastFruit = fruitBasket.getLast();

        System.out.println("첫 번째 과일: " + firstFruit);
        System.out.println("마지막 과일: " + lastFruit);
    }
}
