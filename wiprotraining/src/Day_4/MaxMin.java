package Day_4;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2,3,4,5,7,9};;
		int max = getmax(arr);
		System.out.println("maxvalue is " +max);
		int min = getmin(arr);
		System.out.println("minvalue is " +min);
}
public static int getmax(int[] array)
{
	int maxvalue = array[0];
	for(int i=1;i<array.length;i++)
	{
		if(array[i] > maxvalue)
		{
			 maxvalue = array[i];
		}
	}
	return maxvalue;
}
public static int getmin(int[] array)
{
	int minvalue = array[0];
	for(int i = 1;i<array.length;i++)
	{
		if(array[i] < minvalue)
		{
			minvalue = array[i];
		}
	}
	return minvalue;
}
}
