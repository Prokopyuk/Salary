package lesson4;

public class Task3 {

	public static void main(String[] args) {

		System.out.println(find(new int[]{9,8,7,6,5,4,3,2,1},0,5));
	}

	public static int find(int[] arr, int start, int el) {
		if (start == arr.length) {
			return -1;
		}
		if (arr[start] == el) {
			return start;
		} else {
			return find(arr, start + 1, el);
		}

	}

}
