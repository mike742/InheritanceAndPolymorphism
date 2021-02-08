
public class ErrorHandling {

	static void funException() throws IllegalAccessException {
		System.out.println("funException() called");
		throw new IllegalAccessException("demo message");
	}
 
	public static void main(String[] args) {

		int a = 10, b = 5, c = 4, res;
		int[] arr = new int[2];

		try {
			funException();
			res = a / (b - c);
			System.out.println("res = " + res);

			arr[5] = 10; // 0, 1
		} catch (ArithmeticException e) {
			System.out.println("Division by zero!");
			// b == c
			b++;
			res = a / (b - c);
			System.out.println("res = " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out Of Bounds!!!");
		} catch (Exception e) {
			//System.out.println("Something wrong!");
			System.out.println(e.getClass());
			System.out.println(e.getMessage()); 
		}

		System.out.println("Have a nice day!");
	}

}
