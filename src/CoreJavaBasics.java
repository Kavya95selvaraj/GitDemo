
public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables and data types
		int num=5;
		String url="Rahulshetty";
		String name="Kavya";
		double num1=3.33;
		boolean value=true;
		System.out.println(num);
		System.out.println(url);
		System.out.println(num+"executing");
		//Arrays
		//Method:1
		int[] arr=new int[5];//Allocating the space for the array
		//assainging the values for the arrays
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr[2]);
		//Method:2
		int[] arr1= {1,2,3,4,5,6};//Assigning the values directly
		System.out.println(arr1[3]);
		System.out.println(arr1.length);//to get the size of the array
		
		//for loop
		for(int i=0;i<arr.length;i++)
		{
	System.out.println(arr[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
	System.out.println(arr1[i]);
		}
		//String for loop
		String[] names= {"API","Selenium","Java"};
		for(int i=0;i<names.length;i++)
		{
	System.out.println(names[i]);
		}
//Enhanced for loop-we can declare the for loops like below also
		for(String s:names)
		{
			System.out.println(s);
		}
		
	}

}
