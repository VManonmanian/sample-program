package zoho;
import java.util.Arrays;
import java.util.Scanner;
public class RightShiftAllZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter the vales of an array");
		int[] ar=new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		int index=0;
		int temp;
		for(int i=0;i<size;i++) {
			if(ar[i]!=0) {
				temp=ar[index];
				ar[index]=ar[i];
				ar[i]=temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
