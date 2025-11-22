public class MapOfDemo {
    public static void main(String[] args) {

        System.out.println("=== 기존 방식으로 Map 생성하기 ===");
        java.util.Map<String, Object> oldMap = new java.util.HashMap<>();
        oldMap.put("id", 1);
        oldMap.put("name", "Apple Pie");
        oldMap.put("price", 12000);
        System.out.println(oldMap);

        System.out.println();
        System.out.println("=== Map.of() 메서드로 Map 생성하기 ===");
        java.util.Map<String, Object> newMap = java.util.Map.of(
                "id", 1,
                "name", "Apple Pie",
                "price", 12000
        );
        System.out.println(newMap);
        
    }
}