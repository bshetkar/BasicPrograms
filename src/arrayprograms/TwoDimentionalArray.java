package arrayprograms;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{5,6,7,8,9}};
		int r=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				r=r+a[i][j];
				System.out.print("result;"   +r);
			}
		}
	}

}
