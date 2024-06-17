package fizzbuzz;

public class Step1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				print("FizzBuzz");
			} else if (i % 5 == 0) {
				print("Buzz");
			} else if (i % 3 == 0) {
				print("Fizz");
			} else {
				print(i);
			}

		}
	}
	public static void print(Object o) {
		System.out.println(o);
	}

}
