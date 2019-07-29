
public class ForEachDemo {

	public static void main(String[] args) {

		// Java에서의 For Each문
		
		// 배열(Array) 또는 컬렉션 : 지금은 참고용으로만 제시...
		String[] colors = new String[] {"Red", "Green", "Blue", "Yellow"};
		
		// for문 사용해서 출력
		for (int i = 0; i < colors.length; i++)
		{
			System.out.println(colors[i]); 
		}
		
		// foreach문 : 데이터가 있는 만큼 반복
		for (String color : colors)
		{
			System.out.println(color);
		}
		
	}
}
