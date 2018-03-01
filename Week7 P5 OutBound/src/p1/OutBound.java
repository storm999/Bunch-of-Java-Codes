package p1;

public class OutBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,2,3};
		
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]);
				if(a.length < i)
					throw new IndexOutOfBoundsException("IndexOutOfBounds");
			}
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.print("IndexOutOfBoundsException");
		}
	}

}
