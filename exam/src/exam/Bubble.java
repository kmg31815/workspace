package exam;

public class Bubble {

	public static void main(String[] args) {
		int numbers[] = { 57, 21, 36, 14, 42 };
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		for (int a : numbers) {
			System.out.print(a + "\t");
		}
	}

}
