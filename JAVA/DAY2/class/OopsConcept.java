package swe;
//class and object
class Employee {
	//Variables
		int employeeId;
		String employeeName;
		float employeeSalary;
		//Constructor
		Employee(int employeeId ,String employeeName ,float employeeSalary ){
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.employeeSalary=employeeSalary;
			
		}
		
		//method
		void display() {
			System.out.println("Employee Id: " +employeeId);
			System.out.println("Employee Name: " +employeeName);
			System.out.println("Employee Salary: " +employeeSalary);
		}
}
class abinesh{
	//Variables
	int id;
	String name;
	float Salary;
	//Constructors
	abinesh(int id,String name,float Salary){
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	
	//method
	void raja() {
		System.out.println(id+" "+name+" "+ Salary);
	}
	
	
}
public class OopsConcept {
	public static void main (String [] args ) {
		Employee emp1=new Employee (101,"Abinesh",2000.0f);
		emp1.display();
		
		Employee emp2=new Employee (102,"RAghavan",3000.0f);
		emp2.display();
		System.out.println();
		
		abinesh abi1=new abinesh(289,"onetwothree",4583);
		abi1.raja();
	}

}
