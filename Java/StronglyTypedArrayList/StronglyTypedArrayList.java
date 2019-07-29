import java.util.ArrayList;

// 강력한 형식의 ArrayList
public class StronglyTypedArrayList
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("안녕하세요."); al.add(1234);
        for (Object o: al) 
            System.out.println(o.toString());

        // 강력한 형식의 컬렉션: ArrayList of String
        ArrayList<String> list = new ArrayList<String>();
        list.add("반갑습니다."); list.add("또 만나요.");
        for (String s: list)
            System.out.println(s);
    }
}
