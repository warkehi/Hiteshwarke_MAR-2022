class P13
{
	public static void main(String args [])
	{	int alp=64;
		for(int i=1;i<=5;++i)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print( " " );
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print( (char)(alp+k) +i" " );
			}
				
			System.out.println();
			
		}
		
	}
}