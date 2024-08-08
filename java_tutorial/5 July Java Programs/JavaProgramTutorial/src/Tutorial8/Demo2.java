package Tutorial8;

public class Demo2 {

	public static void main(String[] args) {

		int a = 345;// 34

		int reminder;// 5
		int sum = 0;
		// 0>0
		while (a > 0) 
		{
			reminder = a % 10;		//5 4 3
			System.out.println(reminder);
			
			sum = reminder + sum;

			a = a / 10;

		}

		System.out.println(sum);
	}

}
