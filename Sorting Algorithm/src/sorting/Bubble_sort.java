package sorting;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {1,2,5,4,3,8,7,6};
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
			if(ar[j+1]<ar[j])
			{
				int temp=ar[j+1];
				ar[j+1]=ar[j];
				ar[j]=temp;
			}	
			}
	}
		for(int no:ar)
			System.out.println(no);

}}
