public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(compareSearch(new int[] {1, 2, 3, 4, 5, 6}, 4));
		System.out.println(compareStringSearch(new String[] {"a", "b", "c", "d", "e", "f"}, "d"));
		
	}

	//q1
	public static int[] compareSearch(int[] array1, int num) {
		int low = 0;
		int high = array1.length - 1;
		int count1 = 0;
		int count2 = 0;
		for (int a = 0; a < array1.length; a++) {
			if (array1[a] == num){
				count1 = a+1;
				break;
			} else {
				count1 = array1.length;
			}
		}

		while (low <= high) {
			int mid = (low + high)/2;
			count2++;
			if (array1[mid] == num) {
				low = high + 1;
			}
			else if (num > array1[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}

		}
		int[] array2 = {count1, count2};
		return array2;
	}

	//q2
	public static int[] compareStringSearch(String[] array3, String word) {
		int low = 0;
		int high = array3.length - 1;
		int count3 = 0;
		int count4 = 0;
		for (int a = 0; a < array3.length; a++) {
			if (array3[a].equals(word)){
				count3 = a+1;
				break;
			} else {
				count3 = array3.length;
			}
		}

		while (low <= high) {
			int mid = (low + high)/2;
			count4++;
			if (array3[mid].equals(word)) {
				low = high + 1;
			}
			else if ((array3[mid]).compareTo(word) < 0) {
				low = mid + 1;
			}
			else if ((array3[mid]).compareTo(word) > 0) {
				high = mid - 1;
			}

		}
		int[] array4 = {count3, count4};
		return array4;
	}
	
}
