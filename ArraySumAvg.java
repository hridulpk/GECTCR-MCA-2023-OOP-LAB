import java.util.Scanner;
public class ArraySumAvg{
	public static void main(String args[]){
	System.out.println("printing command line arguments using for loop");
	for(int i=0;i<args.length;i++){
		System.out.println(args[i]);	
	}
	System.out.println("printing command line arguments using for each loop");
	for(String s:args){
		System.out.println(s);
	}
	System.out.println("printing command line arguments as integers");
		int sum=0;
		float avg;
		for(String s:args){
			int n=Integer.parseInt(s);
			sum=sum+n;
		}
		System.out.println("sum= "+sum);
		System.out.println(args.length);
		avg=(float)sum/args.length;
		System.out.println("average= "+avg);
		
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no.of elements you want in array:");
		int n=p.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++){
			a[i]=p.nextInt();
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Sum of array="+sum);
		System.out.println("average of array="+avg);
		
	
	}
}
		
