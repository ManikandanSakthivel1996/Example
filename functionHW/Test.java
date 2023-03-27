package functionHW;

public class Test {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		int b = Integer.parseInt(a[0]);
		int c = Integer.parseInt(a[1]);
		int d = Integer.parseInt(a[2]);
		int e = Integer.parseInt(a[3]);
		int[] f = { b, c, d, e };
		for (int i = 0; i < f.length; i++) {
			if (i % 2 != 0) {
				System.out.println(f[i]);
			}
		}
	}

}
