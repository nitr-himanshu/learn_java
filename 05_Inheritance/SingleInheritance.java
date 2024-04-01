
/* In this inheritance there exist one base class and one derived class.
									Base Class
										|
										|
								  Derived class 
*/
import java.util.Scanner;

class BaseClass {
	int baseClassNum;

	void displayBaseClass() {
		System.out.println("displayBaseClass");
		System.out.println("Value of baseClassNum =" + baseClassNum);
	}
}

class DerivedClass extends BaseClass {
	int derivedClassNum;

	void displayDerivedClass() {
		System.out.println("displayDerivedClass");
		System.out.println("Value of derivedClassNum =" + derivedClassNum);
		System.out.println("Value of baseClassNum =" + baseClassNum);
	}
}

class SingleInheritance {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DerivedClass obj1 = new DerivedClass();
		System.out.println("Enter value for Base class");
		obj1.baseClassNum = scn.nextInt();
		System.out.println("Enter value for Derived class");
		obj1.derivedClassNum = scn.nextInt();
		obj1.displayDerivedClass();
		obj1.displayBaseClass();
		scn.close();
	}
}