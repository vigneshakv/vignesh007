import java.util.*;
public class CheckRepeated{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = 0,Repeated=0,count=0;
		System.out.println("How many numbers");
		N = s.nextInt();
		int Numbers[] = new int[N];
		System.out.println("Enter the numbers");
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < N; i++) 
		{
			Numbers[i] = s1.nextInt();
		}
		Arrays.sort(Numbers);
		for (int i = 0; i < N; i++) 
		{
			for (int j = i+1; j < N; j++) 
			{
				if(Numbers[i] == Numbers[j]&&i<j&&i!=j&&count<=1)
				{
					count++;
					Repeated = Numbers[i];
					System.out.println(Repeated);
				}
			}
			
		}
		
	}
}
