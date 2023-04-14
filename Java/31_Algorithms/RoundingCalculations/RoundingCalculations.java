public class RoundingCalculations {
    public static double roundDecimal(double value, int digits) {
        int i;
        double factor = 1.0;
        double roundingValue = 0.5;

        for (i = 0; i < digits; i++) {
            roundingValue /= 10.0;
            factor *= 10.0;
        }
        return Math.floor((value + roundingValue) * factor) / factor;
    }

    public static void main(String[] args) {
        double temp;
        double num = 3.777;
        System.out.printf("3자리 반올림: %.3f%n", roundDecimal(num, 3));
        System.out.printf("원래 숫자: %.6f%n", num);
        System.out.printf("정수 변환: %d%n", (int) num);

        temp = Math.round(num + 0.5);
        System.out.printf("1자리 반올림: %.3f%n", temp);

        temp = Math.round((num + 0.05) * 10) / 10.0;
        System.out.printf("2자리 반올림: %.3f%n", temp);

        temp = Math.round((num + 0.005) * 100) / 100.0;
        System.out.printf("3자리 반올림: %.3f%n", temp);

        temp = Math.ceil((num + 0.09) * 10) / 10.0;
        System.out.printf("2자리에서 올림: %.3f%n", temp);

        temp = Math.floor(num * 10) / 10.0;
        System.out.printf("2자리에서 내림: %.3f%n", temp);
    }
}
