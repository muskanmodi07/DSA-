public class Multiply {
	static int Mulby10(int a[]) {
		int size = a.length;
		int NewArray[] = new int[size];

		for (int i = 0; i < size; i++) {
			int element = a[i];
			int NewElement = element * 10;
			NewArray[i] = NewElement;
		}
		return NewArray
	}

	public static void main(String args[]) {

		int a[] = {8, 6, 1, 4, 3};
		int ans[] = Mulby10(a);

		for (int i : ans) {
			System.out.println("Updated array" + ans);
		}
	}
}