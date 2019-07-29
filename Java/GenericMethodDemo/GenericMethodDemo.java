
public class GenericMethodDemo {
	public static void main(String[] args) {

		Integer[] intArray = {1, 2, 3, 4, 5};
		printArray(intArray);

		Double[] dblArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		printArray(dblArray);

		Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
		printArray(charArray);
		
	}

	// 제네릭 메소드 : of <>
	public static <T> void printArray(T[] intArray)
	{
		for (T element : intArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
/*	public static void printArray(Object[] intArray)
	{
		for (Object element : intArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
*/	
}
