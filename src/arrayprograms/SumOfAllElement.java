package arrayprograms;

public class SumOfAllElement {
	public static void main(String[] args) {
		int sum=0;
		int a[]= {1,2,3,43,54,67,54,3};
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of all element is:"+sum);
	}

}
