package sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {4,2,5,6,3,8,7};
		for(int i=1;i<7;i++)
		{
			int value=ar[i];
			int index=i;
			while(index>0 && value<ar[index-1])
			{
				ar[index]=ar[index-1];
				index--;
			}
			ar[index]=value;
			
		}
		for(int n:ar)
			System.out.println(n);
	}

}
