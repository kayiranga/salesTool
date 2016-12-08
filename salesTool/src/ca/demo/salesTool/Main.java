package ca.demo.salesTool;

public class Main {
	
	public static void main(String[] args){
		SalesData data=new SalesData();
		data.display();
		displayGreeting();
	
		
	}
	public static void displayGreeting(){
		System.out.println("Hello happy sales people");
		System.out.println("This app show sales data");
	}

}
