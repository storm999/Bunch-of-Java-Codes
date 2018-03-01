package p1;

public class Main {

	public static void main(String[] args) 
	{
		boolean isSwapped = true;
		int[] array = {5,3,7,9,4,1,8,10,21,99,25,33,11};
		
		while(isSwapped)
		{
			isSwapped = false;
			for(int k=0;k<array.length-1;k++)
			{
				if(array[k]>array[k+1])
				{
					int temp = array[k];
					array[k]=array[k+1];
					array[k+1]=temp;
					isSwapped= true;
				}
			}

		}
		
		for(int i=0; i < array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
