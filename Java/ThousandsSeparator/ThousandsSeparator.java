import java.util.Scanner;

public class ThousandsSeparator {
    public static void main(String[] args) {
        // 사용자로부터 입력받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자에게 숫자를 입력하도록 안내
        System.out.print("변환시킬 숫자를 입력하세요... => ");
        String input = scanner.nextLine();

        // 입력받은 문자열이 유효한 숫자인지 검사
        if (!isValidNumber(input)) {
            System.out.println("유효한 숫자가 아닙니다.");
            return;
        }

        // 천 단위 콤마를 추가한 문자열 생성
        String result = addCommas(input);
        // 변환 결과 출력
        System.out.println("변환 결과 : " + result);
    }

    // 문자열이 유효한 숫자인지 검사하는 메소드
    private static boolean isValidNumber(String str) {
        for (char ch : str.toCharArray()) {
            // 문자가 숫자가 아닌 경우 false 반환
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        // 모든 문자가 숫자인 경우 true 반환
        return true;
    }

    // 천 단위 콤마를 추가하는 메소드
    private static String addCommas(String str) {
        int length = str.length(); // 입력 문자열의 길이
        int count = 0; // 콤마를 추가하기 위한 카운터
        // 변환 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();

        // 문자열의 끝에서부터 처음으로 거꾸로 이동하며 콤마 추가
        for (int i = length - 1; i >= 0; i--) {
            // 문자를 결과 문자열의 앞에 추가
            result.insert(0, str.charAt(i));
            count++;

            // 3의 배수 위치에 콤마 추가 (맨 앞 제외)
            if (count % 3 == 0 && i > 0) {
                result.insert(0, ",");
            }
        }

        // 최종 결과 문자열 반환
        return result.toString();
    }
}
