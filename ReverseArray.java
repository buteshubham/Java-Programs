import java.util.*;
class ReverseArray
{

	public static void main(String[] arg)
	{
		String str="a!!!b.c.d,e'f,ghi";
		char ch[]=str.toCharArray();
		System.out.println("Input String="+str);
		int r=ch.length-1,l=0;
		while(l<r)
		{
			if(!Character.isAlphabetic(ch[l]))
				l++;
			else if(!Character.isAlphabetic(ch[r]))
				r--;
			else
			{
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;
			}
		}		
		System.out.println("Output String="+Arrays.toString(ch));
	}
}