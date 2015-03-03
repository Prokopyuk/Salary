package employee;

import java.util.ArrayList;

public class SalaryCount {

	public static void main(String[] args) {

		Manager manager = new Manager("Zoe", 22);
		Boss boss = new Boss("Bender", 77);

		ArrayList <Employee>list = new ArrayList<Employee>();
		list.add(manager);
		list.add(boss);

	}

}
