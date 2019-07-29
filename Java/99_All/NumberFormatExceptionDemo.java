public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        int number = 0;

        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]); 
            }
            catch (NumberFormatException ex) {
                System.err.println("에러 발생: " + args[0] + "는 정수여야 합니다.");
                System.exit(1); 
            }
            System.out.println("입력한 값: " + number);
        }
    }
}
