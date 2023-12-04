
public class MaxMinNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int maxnum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxnum) {
				maxnum = a[i];
			}
		}
		System.out.println("maxnum =" + maxnum);
	}

}
