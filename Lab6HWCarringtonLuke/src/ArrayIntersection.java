
public class ArrayIntersection {
	
	public static void intersection(int[] a1, int[] a2) {
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int p = 0; p < a2.length; p++) {
				if (a1[i] == a2[p] && a1[i] > 0) {
					System.out.println("You have friend with ID number " + a1[i] + " in common.");
					count++;
				}
			}
		}
		System.out.println("You have " + count + " friends in common");
	}
	
	public static void main(String[] args) {
	}

}
