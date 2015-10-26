import FormatIO.*;
public class MyTime {
	//instance vriables
	private int totMins;
	
	//Constructors
	public MyTime (int h, int m){
		
		totMins = h*60 + m;
	}
	
	public MyTime(int hhmm){
		
		int h = hhmm/100;
		int m = hhmm % 100;
		
		totMins = h*60+m;
	}
	
	//Accessory
	public int getHours(){return totMins/60;}
	public int getMinutes(){return totMins%60;}
	public int getHHMM(){return getHours()*100 + getMinutes();}
	
	//methods
	
	public MyTime addTime(MyTime otherTime){
		
		int otherTimeMinutes = otherTime.getHours()*60 + otherTime.getMinutes();
		int newTimeInMins = this.totMins + otherTimeMinutes;
		
		if(newTimeInMins>=1440)
			newTimeInMins -= 1440;
		return new MyTime(newTimeInMins/60, newTimeInMins%60);
		
	}
	
	public MyTime subTime(MyTime otherTime){
		
		int otherTimeInMins = otherTime.getHours()*60 + otherTime.getMinutes();
		int newTimeInMins = this.totMins - otherTimeInMins;
		
		if(newTimeInMins < 0)
			newTimeInMins+=1440;
		
		return new MyTime(newTimeInMins/60, newTimeInMins%60);
		
	}
	
	public static MyTime currentTime(){
		
		long secs = System.currentTimeMillis()/1000;
		long mins = secs/60;
		
		int minInt = (int) mins%1440;
		
		return new MyTime(minInt/60, minInt/60);
	}
	

}
