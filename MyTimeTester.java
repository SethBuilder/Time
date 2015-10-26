import FormatIO.*;
public class MyTimeTester {
	
	public static void main(String[] arg){
	Console con = new Console();
	
	MyTime newTime1 = new MyTime(10, 30);
	con.println("the forst time is " + String.format("%04d", newTime1.getHHMM()));
	
	MyTime newTime2 = new MyTime(2,17);
	con.println("The Second Time is " + String.format("%04d", newTime2.getHHMM()));
	
	MyTime newTime3 = newTime1.addTime(newTime2);
	con.println("third time is: " + String.format("%04d", newTime3.getHHMM()));
	
	MyTime newTime4 = newTime2.subTime(newTime1);
	con.println("fourth time is " + String.format("%04d", newTime4.getHHMM()));
	
	MyTime newTime5 = MyTime.currentTime();
	con.println("current time is: " + String.format("%04d", newTime5.getHHMM()));
	}
}
