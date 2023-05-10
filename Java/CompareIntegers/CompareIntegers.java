public class CompareIntegers {

    // 비교 메소드
    // 두 개의 int형 인자를 받아 비교합니다.
    // a가 b보다 크면 양수, a와 b가 같으면 0, a가 b보다 작으면 음수를 반환합니다.
    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // compare 메소드를 이용하여 x와 y를 비교하고 그 결과를 comparison에 저장합니다.
        int comparison = compare(x, y);

        if (comparison < 0) {
            System.out.println("x는 y보다 작습니다.");  // comparison이 음수이면 x가 y보다 작습니다.
        } else if (comparison > 0) {
            System.out.println("x는 y보다 큽니다.");  // comparison이 양수이면 x가 y보다 큽니다.
        } else {
            System.out.println("x와 y는 같습니다.");  // comparison이 0이면 x와 y는 같습니다.
        }
    }
}