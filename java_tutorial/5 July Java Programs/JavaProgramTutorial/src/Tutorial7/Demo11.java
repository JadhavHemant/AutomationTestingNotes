package Tutorial7;

public class Demo11 {

	public static void main(String[] args) {
		int num = 3;
		int original = num;
		
		int order = String.valueOf(num).length();
		int sum = 0;

		while (num > 0) 
		{

			int lastDigit = num % 10;
			sum += Math.pow(lastDigit, order);

			num /= 10;

		}

		if (sum == original)
			System.out.println("it is a armstrong number of order " + original);

		else
			System.out.println(original + " Not armstrong number.");
	}

}
