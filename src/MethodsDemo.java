
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d=new MethodsDemo();
		d.getdata();
		String name=d.getData1();
		System.out.println(name);
		int number=d.getData2();
		System.out.println(number);
		MethodsDemo2 d1=new MethodsDemo2();
		d1.getUserData();
		

	}
public void getdata() {//This method didn't has any return type
	System.out.println("From getdata method");
	}
public String getData1() {//this method has String return type
	System.out.println("From getData1 Method");
	return "Selenium-Java";
}
public static int getData2() {//this method has integer return type
	System.out.println("From getData2 method");
	return 2;
}
}
