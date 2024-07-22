package Oops_Programming;

public class DriverMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("A001","Aravind",725000);
        Employee e2 = new Employee("A002","VIcky",1000000);
        Employee e3 = new Employee("A003","Aju",800000);

        e1.calcTax();
        e2.calcTax();
        System.out.println("--------------Product--------------------");
        Product p1 = new Product("p001",99.75,20);
        Product p2 = new Product("p002",80.50,8);

        p1.calcTax();
        p2.calcTax();




    }
}
