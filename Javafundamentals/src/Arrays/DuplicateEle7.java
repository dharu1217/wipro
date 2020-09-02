package Arrays;

public class DuplicateEle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,34,12,45,67,89};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
}

}
