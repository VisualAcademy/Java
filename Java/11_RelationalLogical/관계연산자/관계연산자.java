public class 관계연산자 {
    public static void main(String[] args) {
        int first_num = 3, second_num = 5;
        boolean greater = first_num > second_num;
        boolean smaller = first_num < second_num;
        System.out.printf("first_num = %d second_num = %d " +
                          "first_num > second_num = %b " +
                          "first_num < second_num = %b\n", 
                          first_num, second_num, greater, smaller);
    }
}
