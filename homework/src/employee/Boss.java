package employee;

public class Boss extends Employee{

	private int rate = 10;
	
	public Boss(){
		super();
	}
	
	public Boss(String name, int daysCount){
		this.name=name;
		this.daysCount=daysCount;
		printEmployeeInfo();

	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return rate*daysCount;
	}
	
	@Override
	public int  getRate(){
		return  rate;
	}
	
	@Override
	public void setRate(int rate){
		this.rate = rate;
	}
	
}
