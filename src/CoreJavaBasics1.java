import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Taking multiples of 2 from the array
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is multiple of 2");
			}
			else
			{
				System.out.println(arr[i]+" is not multiple of 2");
			}
		}
//Check whether the given array has multiple of 2
		int[] arr1= {1,3,4,5,6,8};
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
				System.out.println(arr1[i]);
			break;
			}
		}
//take only 2 multiple of 2 numbers from the array
		int[] arr2= {1,3,4,5,6,8};
		int a=0;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr1[i]%2==0 && a<2)
			{
				System.out.println(arr1[i]);
			a++;
			}
		}
//Exercise
//Step 1:Create a new array called numbers to store 5 numerical values of your choice (they can be whole numbers or decimals)
//Step 2:Print the following:The first element of the numbers array.The last element of the numbers array.
//Step 3:Using a loop, print the elements of the numbers array in reverse order.
//Step 4:Calculate the total number of elements within the numbers array.
		int[] numbers= {1,2,3,4,5};
		System.out.println(numbers[0]+" is the first element of the numbers array");
		System.out.println(numbers[4]+" is the last element of the numbers array");
		System.out.println("Reverse order of the numbers array");
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println(numbers[i]);
			}
		System.out.println("The total number of elements within the numbers array is "+numbers.length);
	
//ArrayList
		ArrayList<String> b=new ArrayList<String>();
		b.add("Selenium");//adding the values in arraylist
		b.add("Java");
		b.add("Automation");
		b.add("web");
		System.out.println(b.get(3));//printing the value of 3rd index
		//To remove the value from the arraylist
		b.remove("Selenium");
		System.out.println(b.get(0));
		
//Print the values inside of thearraylist
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i));
		}
//Print the values inside of the arraylist using enhanced for loop
		System.out.println("Enhanced for loop");
	for(String s:b)
	{
		System.out.println(s);		
	}
//Check whether Java is present in the arraylist
	System.out.println(b.contains("Java"));
	
//convert the array into arraylist
	String[] arr3= {"Java","Selenium","Automation","Testing"};
	List<String> arr3Arraylist=Arrays.asList(arr3);
	System.out.println(arr3Arraylist.contains("Selenium"));
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
