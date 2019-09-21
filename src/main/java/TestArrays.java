import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TestArrays.testintArray1();
		TestArrays.testCharArray1();

	}

	private static void testintArray1() {
		System.out.println("testintArray1");
		int [] arrInt =  {1,2,3,4,5};
		String t = Arrays.toString(arrInt);
		System.out.println(t);//[1, 2, 3, 4, 5]
		t= t.replaceAll(", ", "");
		System.out.println(t);//[12345]
		System.out.println(String.valueOf(arrInt));//[I@7382f612
	}
	
	private static void testCharArray1() {
		System.out.println("testCharArray1");
		String s ="Hello";
		char [] chA = s.toCharArray();
		for (char c : chA) {
			System.out.println(c);
		}
		System.out.println(String.valueOf(chA));
	}
}
