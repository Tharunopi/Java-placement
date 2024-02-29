public class q11 {
    public static void main(String[] args) {
        double grossSalary=10000;
	    double incomeTax=1000; 
	    double providentFund=800;    
	    double professionalTax=500;
        String name = "Aqeel";
        double netsalary = grossSalary - (incomeTax + providentFund + professionalTax);
        System.out.println("net salary of an employee is "+ name + " "+ netsalary);
    }
}
