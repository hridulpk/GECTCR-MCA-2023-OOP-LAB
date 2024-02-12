import java.util.Scanner;
public class ArrayUtils{
	void leastvalue
	
	
	
	public static void main(String args[]){
		
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no.of elements you want in array:");
		int n=p.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements:");
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=p.nextInt();
			sum=sum+a[i];
		}
		
		int l=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>l){
				l=a[i];
			}
		}
		int b=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>b){
				if(a[i]!=l){
					b=a[i];
				}
				
			}
		}
		System.out.println("largest number in array= "+l);
		System.out.println("2nd largest number in array="+b);
	}
}
	
