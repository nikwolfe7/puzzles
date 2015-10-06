package main;

import java.util.Comparator;

public class CompareExample {

	public static void main(String[] args) {
		
		
	}
	
	public class Employee implements Comparable<Employee> {
		public String name;
		public String department;
		public int age;
		
		public Employee(String n, String d, int a) {
			this.name = n;
			this.department = d;
			this.age = a;
		}

		@Override
		public int compareTo(Employee o) {
			/** some policy **/
			return 0;
		}

	}

	public class EmployeeComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			/** some policy **/
			return 0;
		}
		
	}


}
