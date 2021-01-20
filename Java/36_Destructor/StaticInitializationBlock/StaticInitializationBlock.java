//[?] 정적 초기화 블록
import java.util.ArrayList;

public class StaticInitializationBlock {
    private static final ArrayList<Integer> perfectNumbers = new ArrayList<>(); 
    static {
        perfectNumbers.add((1 + 2 + 3));
        perfectNumbers.add(28);
        perfectNumbers.add(496);
        perfectNumbers.add(8128);
    }
    public static void main(String[] args) {
        // 완전수 최초 네 개
        for (var pn : perfectNumbers) {
            System.out.println(pn);
        }
    }
}
