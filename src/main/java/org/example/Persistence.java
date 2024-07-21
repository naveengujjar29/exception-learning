package org.example;

public class Persistence {

    public static void main(String[] args)  {

        EmployeeCreator employeeCreator = new EmployeeCreator();

        try {
            employeeCreator.createEmployee("Naveen Kumar", 0000, 12000);
        } catch(InvalidEmployeeIdException ex) {
            System.out.println("Employee id is not good " + ex.getMessage()) ;
        } catch(InvalidSalaryException ex) {
            System.out.println("Salary id is not good " + ex.getMessage()) ;
        } finally {
            System.out.println("executed.");
        }

    }
}
