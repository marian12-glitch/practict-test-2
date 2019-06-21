class Holiday{

	private String name;
	private int day;
	private String month;

public Holiday(String name, int day , String month ){

	this.name=name;
	this.day=day;
	this.month=month;

}

public boolean insameMonth(Holiday happy){

	return this.month.equals(happy.month);
}


public  double avgDate (Holiday[] happy){

	int sum = 0 ;
	for (int i = 0 ; i<happy.length; i++){
		sum = sum + happy[i].day;

	}

	
	return((double)sum)/happy.length;

}




}