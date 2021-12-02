package packageA;

public class SinglePalidromeNumber {
	public static void main(String[] args) {
		int num= 454;
		int pal=num;
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			num= num/10;
			rev= rev*10+rem;
			System.out.println("reverse number is:"+rev);
		}
		if(pal==rev)
		{
			System.out.println("its palidrome number:" +pal+  " "+rev);
		}else {
			System.out.println("its not palidrome number:" +pal+"  " +rev);
		}
	
		}
	}
