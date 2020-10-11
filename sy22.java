package sy22;
public class sy22 {
public static void main(String[] args) {
		int i,j;
		for(i=1;i<10;i++)
		{
			for(j=1;j<10;j++)
			{
				if(i>=j)
				{
					System.out.printf("%d*%d=%2d  ",i,j,i*j);
				}
			}
			System.out.printf("\n");
		}
	}
}
