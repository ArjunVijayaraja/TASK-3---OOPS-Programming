package Oops_Programming;

public class Employee implements Taxable{
    public String empId;
    public String empName;
    public int salary;

    public Employee(String empId,String empName,int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
       double incomeTax_Value = this.salary*(incomeTax/100);
        System.out.println("The Salary of the employee : "+this.empName +" is "+this.salary);
        System.out.println("The income Tax value is : "+ (float) incomeTax_Value);
        System.out.println();
       return incomeTax_Value;
    }
}
