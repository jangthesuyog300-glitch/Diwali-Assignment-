package assignment;

public class challenge {

	public static void main(String[] args) {
       
		
		String a[]= {"suyog","sarvesh","prathmesh"};
		
		for(int i=0;i<=a.length;i++)
		{
			if(a[0].length()<a[i].length())
			{
				a[0]=a[i];
			}
		}
		System.out.println("longest string is : "+a[0]);

 }
} 
