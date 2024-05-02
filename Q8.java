
public class Q8 {
	public static void main(String[] args) {
			int rows = 4;
			char c = 'J';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "   ");
                c--;
            }
            
            System.out.println();
        }
	}

}
