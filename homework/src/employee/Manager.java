package employee;

public class Manager extends Employee {

	
	private int  stavka = 5;
	
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
	public int  getStavka(){
		return  stavka;
	}
	
	@Override
	public void setStavka(int stavka){
		this.stavka = stavka;
	}

	@Override
	public double getSalary() {
		
		return stavka*daysCount;
	}
	
		
}
