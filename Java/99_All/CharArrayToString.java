// 문자 배열을 문자열로 변환하기 
public class CharArrayToString {
    public static void main(String[] args) {
        char[] charArray = { 'A', 'B', 'C' };

        String str = new String(charArray);

        System.out.println(str); // "ABC"
    }
}
