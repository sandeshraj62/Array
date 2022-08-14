package Array;

public class missing_number 
{
	public static void main(String args[])
	{ 
      int arr[]= new int[]{1,2,3,4,5,7,8};
      int n=8;
      int mis = 1;
      for(int i=0;i<n-1;i++)
      {
	    if(arr[i]==mis)
		   mis++;
      }
      System.out.println(mis);
      
}
}