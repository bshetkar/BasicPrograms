package allpatternprograms;

public class Pattern7 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2==1)
			{
				System.out.print(j);
			}else
			System.out.print("*");
		}
		System.out.println();
	}
}
}
