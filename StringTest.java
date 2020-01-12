
public class StringTest {

	public static void main(String[] args) {
		String str1;
		String str2;
		str1 = "Apple";
		str2 = "Apple";
		System.out.println(str1 == str2);// TODO Auto-generated method stub
		System.out.println(str1.equals(str2));
		String str3 = new String("Apple");
		String str4 = new String("Apple");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}

}
