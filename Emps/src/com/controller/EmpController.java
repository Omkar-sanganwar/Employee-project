package com.controller;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmpController {
	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDao();
		System.out.println(ed.showEmployeeById(1));
		System.out
				.println("**********************ALL********************************");

		for (Employee eee : ed.showAllEmployee()) {
			System.out.println(eee);
		}
		System.out
				.println("***********************Only tester************************************");

		Employee[] testers = ed.showEmployeeRole("Tester");
		for (Employee e : testers) {
			System.out.println(e);
		}

		System.out
				.println("********************MAx SAL***************************************");

		System.out.println("Employee with maximum salary: "
				+ ed.employeeMaxSalary());

		System.out
				.println("*********************MIN SAL**************************************");

		System.out.println("Employee with minimum salary: "
				+ ed.employeeMinSalary());

		System.out
				.println("*********************ASC**************************************");

		System.out.println("Employees sorted by ascending ID:");
		for (Employee e : ed.sortEmployeeAsc()) {
			System.out.println(e);
		}
		System.out
				.println("**********************DSC *************************************");

		System.out.println("Employees sorted by descending ID:");
		for (Employee e1 : ed.sortEmployeeDsc()) {
			System.out.println(e1);
		}
	}
}

/*
 * sequenceDiagram participant EmpController as EC participant EmployeeDao as ED
 * participant Employee as E
 * 
 * note "Create EmployeeDao instance" EC->>ED: new EmployeeDao()
 * 
 * note "Show employee by ID" EC->>ED: showEmployeeById(1) ED->>E: get employee
 * by ID ED->>EC: return Employee
 * 
 * note "Show all employees" EC->>ED: showAllEmployee() ED->>E: get all
 * employees ED->>EC: return Employee[]
 * 
 * note "Show employees by role" EC->>ED: showEmployeeRole("Tester") ED->>E: get
 * employees by role ED->>EC: return Employee[]
 */