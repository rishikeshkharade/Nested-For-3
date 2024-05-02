
public class Q7 {
	public static void main(String[] args) {
		int row = 6;
		char c = 'F';
		for (int i = 1; i <= row; i++) {
			char c1 = c;
			for (int j = 1; j <= i; j++) {
                System.out.print(c1 + "   ");
                c1++;
			}
			c--;
            System.out.println();
		}
	}

}
