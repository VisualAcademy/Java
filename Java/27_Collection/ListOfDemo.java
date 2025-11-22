public class ListOfDemo {
    public static void main(String[] args) {

        System.out.println("=== 기존 방식으로 List 생성하기 ===");
        java.util.List<String> oldList = new java.util.ArrayList<>();
        oldList.add("Apple");
        oldList.add("Blueberry");
        oldList.add("Pumpkin");
        System.out.println(oldList);

        System.out.println();
        System.out.println("=== List.of() 메서드로 List 생성하기 ===");
        java.util.List<String> newList = java.util.List.of(
            "Apple", "Blueberry", "Pumpkin"
        );
        System.out.println(newList);
        
    }
}