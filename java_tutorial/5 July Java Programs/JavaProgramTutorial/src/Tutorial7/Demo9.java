package Tutorial7;

public class Demo9 {

	public static void main(String[] args) {
		// Armstrong number

		int a = 153, n = 0, i = 0, j = 0;

		n = a;
		while (a > 0) 
		{
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}

		if (n == j) {
			System.out.print("amstrong");
		} else {
			System.out.print(" not amstrong");
		}
	}

}
