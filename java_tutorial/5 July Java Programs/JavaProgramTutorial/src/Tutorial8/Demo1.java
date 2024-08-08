package Tutorial8;

public class Demo1 {

	public static void main(String[] args) {

		int a = 345;

		// find 1st number
		int b = a / 100; // 345/100
		System.out.println(b);

		// 345/10 = 34%10= 4;
		int c = (a / 10) % 10;
		System.out.println(c);
		
		// 345%10 = 5
		int d = a % 10;
		System.out.println(d);

		int e = b + c + d;
		System.out.println(e);
	}
}
