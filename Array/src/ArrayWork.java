
public class ArrayWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double prices[] = { 200,  15, 45, 9.99 };

		double total= 555;

		for (int i=0; i < prices.length; i++)
		{
		total += prices[i];
		}

		System.out.println("The total of the array is " + total);

		
		

	}

}
