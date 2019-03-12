import java.util.*;

public class Descend{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = 0,j=0;
		System.out.println("How many numbers");
		N = s.nextInt();
		int Numbers[] = new int[N];
		int temp[] = new int[N];
		System.out.println("Enter the numbers");
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < N; i++) 
		{
			Numbers[i] = s1.nextInt();
		}

		int temper=0;
		for(int i = 0;i < N ;i++)
		{
			for(int k = i+1;k<N;k++)
			{
				if(Numbers[i]<Numbers[k])
				{
					temper=Numbers[i];
					Numbers[i] = Numbers[k];
					Numbers[k] = temper;
				}
			}
			//System.out.println(Numbers[i]);
		}
		for (int i = 0; i < N-1; i++) 
		{
			if(Numbers[i]!=Numbers[i+1])
			{
				temp[j++]=Numbers[i];
			}
			
		}
		temp[j++] = Numbers[N-1];
			
		for (int i = 0; i < j; i++) 
		{
			Numbers[i] = temp[i];
	      System.out.println(Numbers[i]);
		}
	
	}
}
