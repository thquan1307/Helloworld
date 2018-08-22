package quan.dev;

public class Helloworld {
	public static void main(String[] args) {
		System.out.println("BANG CUU CHUONG");
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i  + "=" +  (i*j) + "\t");
			}
			System.out.println("");
		}
	}
}
