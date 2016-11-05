package sorting;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {4,2,5,1,3,8,7};
		for(int i=0;i<6;i++)
		{
			int imin=i;
		for(int j=i+1;j<7;j++)
		{
			if(ar[imin]>ar[j])
				imin=j;
		}
		int temp;
		temp=ar[i];
		ar[i]=ar[imin];
		ar[imin]=temp;
	}
		for(int no:ar)
			System.out.println(no);

	}
	}
