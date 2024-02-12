import java.util.Scanner;
public class ArrayUtils{
	public static void main(String args[]){
		
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no.of elements you want in array:");
		int n=p.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++){
			a[i]=p.nextInt();
			sum=sum+a[i];
		}
		int l=a[0];
		for(i=0;i<n;i++){
			if(a[i]<l){
				l=a[i];
			}
		}
		System.out.println("lowest number in array= "+l);
			
		
	
	}
}
	
