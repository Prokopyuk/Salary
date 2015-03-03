package employee;

public class Boss extends Employee{

	private int stavka = 10;
	
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
		return stavka*daysCount;
	}
	
	@Override
	public int  getStavka(){
		return  stavka;
	}
	
	@Override
	public void setStavka(int stavka){
		this.stavka = stavka;
	}
	
}
