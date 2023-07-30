package encapsulation;

public class Encapsulation1 {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int sal) {
		if(sal<50000) {  //changed by vikas.
			salary = sal;   // dont want user to put salary more than 50000
			
		} else {
			salary = 0; //if he tries to do so, salary will become 0
		}
	}
	
	
}
