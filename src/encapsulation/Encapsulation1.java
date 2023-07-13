package encapsulation;

public class Encapsulation1 {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int sal) {
		if(sal>0) {
			salary = sal;
			
		} else {
			salary = 0;
		}
	}
	
	
}
