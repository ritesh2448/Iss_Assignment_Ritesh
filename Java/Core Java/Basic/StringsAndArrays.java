import java.util.Arrays;

public class StringsAndArrays {
	
	public static void main(String[] args) {
		//String
		String text="Hi There";
		System.out.println("Length : "+text.length());
		System.out.println(text.charAt(1));
		System.out.println(text.substring(4));
		System.out.println(text.contains("Hello")); 
		System.out.println(text.indexOf("There"));
		System.out.println(text.concat(",Wassup!"));
		
		System.out.println();
		
		//Arrays
		int[] arrayExample= {5,9,4,7,36,14};
		int[] list1 = {1,2,3};
		int[] list2 = {1,2,3};
		System.out.println("Length : "+arrayExample.length);
		Arrays.sort(arrayExample);
		for(int i:arrayExample) {
			System.out.print(i+" ");
		}
		System.out.println(Arrays.binarySearch(arrayExample, 10));
		System.out.println(Arrays.equals(list1, list2));
		System.out.println(Arrays.equals(list1, arrayExample));
	}

}
