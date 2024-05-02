
public class Q3solution2 {
	public static void main(String[] args) {
		int row  = 4;
		int num = row*(row+1)/2;
		for(int i = 1; i <=num; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(num+++" ");
			}
		}
	}

}
