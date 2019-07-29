public class TernaryPractice {
    public static void main(String[] args) {        
        String result = "";
        int score = 59; 

        result = (score >= 60) ? "합격": "불합격"; 

        System.out.println(String.format("점수: %d, 결과: %s", score, result));
    }
}
