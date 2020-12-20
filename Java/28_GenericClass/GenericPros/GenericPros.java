import java.util.ArrayList;
import java.util.List;

/// <summary>
/// 제네릭 클래스 사용의 장점
/// </summary>
public class GenericPros {
    public static void main(String[] args) {
        //[1] 제네릭 사용 전
        List colors = new ArrayList();
        colors.add("red"); // 박싱(Boxing): 포장
        String red = (String)colors.get(0); // 언박싱(UnBoxing): 포장 풀기
        System.out.println("Color: " + red);
        colors.add(1234); // 형식 안정성 위배

        //[2] 제네릭 사용 후 => 형식 안정성과 성능 향상 
        List<String> names = new ArrayList<>();
        names.add("redplus");
        String redplus = names.get(0); // 박싱과 언박싱이 없기에 성능 향상
        System.out.println("Name: " + redplus);
        //names.add(1234); // 컴파일 타임 에러 발생 => 형식 안정성 제공
    }    
}
