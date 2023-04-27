import java.util.Scanner;

public class toPower {
	
	public static int[] toPower(int size, int power) {
		int [] newArray = new int[size];
		for(int i = 0; i < size; i++) {
			newArray[i] = (int)(Math.pow((double)i, (double)power));
		}
		return newArray;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int power=in.nextInt();
		int[] result = toPower(size,power);
		for(int i = 0; i < size; i++)
		    System.out.print(result[i]+ " ");	
	}
	
}
