package employee;

abstract public class Employee {

	protected String name;
	protected int daysCount;
	protected int stavka = 2;


	public Employee() {
		
	}
	
	public abstract double getSalary();



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysCount() {
		return daysCount;
	}

	public void setDaysCount(int daysCount) {
		this.daysCount = daysCount;
	}
	
	public int getStavka() {
		return stavka;
	}

	public void setStavka(int stavka) {
		this.stavka = stavka;
	}

	
	public  void printEmployeeInfo()
	{
		System.out.println(getClass().getSimpleName() + " name  is  "+getName()+", working days  - " + getDaysCount()+ " , stavka  - "+getStavka()+" and salary is " +getSalary());
	}

	
}
