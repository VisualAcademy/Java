/*
    Rank Algorithm Demo : 5개의 수를 입력받아 순위(Rank)를 구하는 프로그램
*/
import java.util.Scanner;

public class RankAlgorithmDemo {
    public static void main(String[] args) {
        int[] score = new int[5]; // 입력받은 점수를 저장할 배열
        int[] rank = new int[5]; // 점수별 순위를 저장할 배열
        int i, j; // 반복문을 위한 변수
        Scanner scanner = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성

        // 사용자로부터 5개의 점수 입력받기
        System.out.print("5개의 점수를 입력하세요: ");
        for (i = 0; i < 5; i++) {
            score[i] = scanner.nextInt(); // 점수 입력받기
        }
        scanner.close(); // Scanner 객체 닫기

        // 순위 알고리즘
        for (i = 0; i < 5; i++) {
            rank[i] = 1; // 매 회전마다 1등으로 초기화
            for (j = 0; j < 5; j++) {
                if (score[i] < score[j]) {
                    rank[i]++; // 점수가 낮으면 순위를 1 증가시킴
                }
            }
        }

        // 입력받은 점수와 순위 출력
        System.out.println("  점 수   순 위 ");
        for (i = 0; i < 5; i++) {
            System.out.printf("%7d %7d\n", score[i], rank[i]);
        }
    }
}
