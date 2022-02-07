
public class StaicKeyword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student S1 = new Student(12,"Abhishek");	
		
		S1.Display();
	}

}

class Student{
	

	int age;
	String name;
	static String School ="VNSP";
	
	void Display() {
		System.out.println("Name is " +name + "is of Age" + age +"in School" + School);
	}
	
	Student(int Age, String Name) {
			// TODO Auto-generated constructor stub
			
			this.age =Age;
			this.name=Name;
		}
}

