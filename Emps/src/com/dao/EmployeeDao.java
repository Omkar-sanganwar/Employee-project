package com.dao;

import com.entity.Employee;

public class EmployeeDao {

	Employee e1 = new Employee(1, "Raj patil", "Developer", 75000);
	Employee e2 = new Employee(3, "Neha Singh", "Tester", 48000);
	Employee e3 = new Employee(7, "Raj rajput", "Developer", 48000);
	Employee e4 = new Employee(2, "Raj patil", "Developer", 48000);
	Employee e5 = new Employee(5, "Raj patil", "Developer", 48000);
	Employee e6 = new Employee(2, "Ranbir Kapoor", "HR", 48000);
	Employee e7 = new Employee(5, "Amitabh Bachchan", "del", 150000);
	Employee e8 = new Employee(9, "Salman Khan", "tester", 100000);
	Employee e9 = new Employee(4, "Shahrukh Khan", "tester", 120000);
	Employee e10 = new Employee(6, "Deepika Padukone", "Ceo", 90000);
	Employee[] emp = new Employee[10];

	public Employee showEmployeeById(int id) {
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		int index = id - 1;
		return emp[index];

	}

	public Employee[] showAllEmployee() {
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		return emp;

	}

	public Employee[] showEmployeeRole(String role) {
		// First, count how many employees match the role
		int count = 0;
		for (Employee e : emp) {
			if (e.getRole().equalsIgnoreCase(role)) {
				count++;
			}
		}

		// Create an array of the appropriate size
		Employee[] employeesByRole = new Employee[count];

		// Populate the array with matching employees
		int index = 0;
		for (Employee e : emp) {
			if (e.getRole().equalsIgnoreCase(role)) {
				employeesByRole[index++] = e;
			}
		}

		return employeesByRole;
	}
	 public Employee employeeMaxSalary() {
	        Employee maxSalaryEmployee = emp[0];
	        for (Employee employee : emp) {
	            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
	                maxSalaryEmployee = employee;
	            }
	        }
	        return maxSalaryEmployee;
	 }
	 public Employee employeeMinSalary() {
	        Employee minSalaryEmployee = emp[0];
	        for (Employee employee : emp) {
	            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
	                minSalaryEmployee = employee;
	            }
	        }
	        return minSalaryEmployee;
	    }
	 public Employee[] sortEmployeeAsc() {
	        Employee[] sortedEmployees = emp.clone();
	        for (int i = 0; i < sortedEmployees.length; i++) {
	        	 for (int j = i + 1; j < sortedEmployees.length; j++) {
	                 if (sortedEmployees[i].getEmdid() > sortedEmployees[j].getEmdid()) {
	                     Employee temp = sortedEmployees[i];
	                     sortedEmployees[i] = sortedEmployees[j];
	                     sortedEmployees[j] = temp;
	                 }
	             }
	         }
	         return sortedEmployees;
	     }
	 public Employee[] sortEmployeeDsc() {
	        Employee[] sortedEmployees = emp.clone();
	        for (int i = 0; i < sortedEmployees.length; i++) {
	            for (int j = i + 1; j < sortedEmployees.length; j++) {
	                if (sortedEmployees[i].getEmdid() < sortedEmployees[j].getEmdid()) {
	                    Employee temp = sortedEmployees[i];
	                    sortedEmployees[i] = sortedEmployees[j];
	                    sortedEmployees[j] = temp;
	                }
	            }
	        }
	        return sortedEmployees;
	    }

}

/*
classDiagram
class Employee {
    -emdid: int
    -name: String
    -role: String
    -salary: int
    +Employee()
    +Employee(int, String, String, int)
    +getEmdid(): int
    +setEmdid(int)
    +getName(): String
    +setName(String)
    +getRole(): String
    +setRole(String)
    +getSalary(): int
    +setSalary(int)
    +toString(): String
}

class EmployeeDao {
    -emp: Employee[10]
    -e1: Employee
    -e2: Employee
    -e3: Employee
    -e4: Employee
    -e5: Employee
    -e6: Employee
    -e7: Employee
    -e8: Employee
    -e9: Employee
    -e10: Employee
    +showEmployeeById(int): Employee
    +showAllEmployee(): Employee[]
    +showEmployeeRole(String): Employee[]
}

class EmpController {
    +main(String[]): void
}

EmployeeDao --> Employee: uses
EmpController --> EmployeeDao: uses */
