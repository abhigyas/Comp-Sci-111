public class FindDuplicate {
	public static void main(String[] args) {
		boolean dupe = false;
		int[] fDupe = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			fDupe[i] = Integer.parseInt(args[i]);
		}
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if (i != j) {
					if (fDupe[i] == fDupe[j]) {
						dupe = true;
					}
				}
			}
		}
		System.out.println(dupe);
	}
}