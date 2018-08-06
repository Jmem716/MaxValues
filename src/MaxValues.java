public class MaxValues {
	public static void main(String[] args) {
		//Array that stores three integers
		Integer[] numbers= { 1,4,3 };
		System.out.print("Array of integers: ");
	    for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");

	    }
	    //Max value is printed out 
		System.out.println("\nThe max of all three values above is: " + max(numbers) + "\n");

		//Array that stores three colors
		String[] colors = { "red", "blue", "green" };
		System.out.print("Array of colors: ");
		for (int i = 0; i < colors.length; i++) {
			System.out.print(colors[i] + ", ");
		}
		//Max value is printed out
		System.out.println("\nThe max of all three values above is: " + max(colors) + "\n");

		//Array that stores circles
		Double[] circles = { 3.0, 2.9, 0.9 };
		System.out.print("Array of circles: ");
		for (int i = 0; i < circles.length; i++) {
			System.out.print(circles[i] + ", ");
		}
		//Max value is printed out
		System.out.println("\nThe max of all three values above is: " + max(circles) + "\n");

	}
	
//Compares values to find Max
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (max.compareTo(list[i]) < 0) {
				max = list[i];
			}
		}
		return max;
	}
}
