package com.example.demo.employee;
import org.springframework
.stereotype
.Repository;

//Importing the employees class to
//use the defined properties
//in this class
import com.example.demo.employee.Employees;

@Repository

//Class to create a list
//of employees

public class EmployeeDAO {
	private static Employees list
    = new Employees();

// This static block is executed
// before executing the main
// block
static
{

    // Creating a few employees
    // and adding them to the list
    list.getEmployeeList().add(
        new Employee(
            1,
            "Prem",
            "Tiwari",
            "chapradreams@gmail.com"));

    list.getEmployeeList().add(
        new Employee(
            2, "Vikash",
            "Kumar",
            "abc@gmail.com"));

    list.getEmployeeList().add(
        new Employee(
            3, "Ritesh",
            "Ojha",
            "asdjf@gmail.com"));

       
}

// Method to return the list
public Employees getAllEmployees()
{

    return list;
}

   
    // Method to add an employee
    // to the employees list
    public void
    addEmployee(Employee employee)
{
    list.getEmployeeList()
        .add(employee);
       
}


	public com.example.demo.employee.Employees getAllEmployees1() {
		// TODO Auto-generated method stub
		return null;
	}
}

