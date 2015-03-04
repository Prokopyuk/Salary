package employee;

public class Manager extends Employee {

	
	private int  rate = 5;
	
	public Manager(){
		super();
	}
	
	public Manager(String name, int daysCount){
		this.name=name;
		this.daysCount=daysCount;
		getSalary();
		printEmployeeInfo();
		

	}
	@Override
	public int  getRate(){
		return  rate;
	}
	
	@Override
	public void setRate(int rate){
		this.rate = rate;
	}

	@Override
	public double getSalary() {
		
		return rate*daysCount;
	}
	
		
}
