//[?] 입력 받은 돈을 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
public class Algorithm_Count_Money {
    public static void main(String[] args) {
        int money = 66666; // 입력 받은 화폐
        int won = 50000;
        int cnt = 0; 
        int sw = 0; // 스위치 변수: 5로 나눌건지 2로 나눌건지 결정
        for (int i = 0; i < 10; i++) {
            cnt = money / won; 
            System.out.printf("%,6d원 : %,6d매\n", won, cnt);
            money = money - (won * cnt); // 50001 - 50000 = 1
            System.out.println(" 남은 돈 : " + String.format("%,8d\n", money));
            if (sw == 0) {
                won = won / 5; // 50000 / 5 = 10000
                sw = 1;
            }
            else {
                won = won / 2; // 10000 / 2 = 5000
                sw = 0; 
            }
        }
    }
}
