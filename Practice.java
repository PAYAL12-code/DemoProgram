package Demo.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Practice{
	/*  public static double findSecondHighestSalary(List<Employee> employees) {
	        if (employees.size() < 2) {
	            // Handle the case where there are not enough employees
	            return Double.NaN;
	        }

	        // Sort employees by salary in descending order
	        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());

	        // Find the second-highest salary based on employee ID
	        int highestEmployeeId = employees.get(0).getId();
	        double secondHighestSalary = Double.NaN;

	        for (Employee employee : employees) {
	            if (employee.getId() != highestEmployeeId) {
	                secondHighestSalary = employee.getSalary();
	                break;
	            }
	        }

	        return secondHighestSalary;
	    }

	    public static void main(String[] args) {
	        // Create a list of employees
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(101, 50000));
	        employees.add(new Employee(102, 60000));
	        employees.add(new Employee(103, 55000));
	        employees.add(new Employee(104, 70000));

	        // Find the second-highest salary
	        double secondHighestSalary = findSecondHighestSalary(employees);

	        if (!Double.isNaN(secondHighestSalary)) {
	            System.out.println("Second-highest salary: " + secondHighestSalary);
	        } else {
	            System.out.println("Not enough employees to determine the second-highest salary.");
	        }
	    }*/
	
	public static void main(String[] args) {
		  // Get the double value
        double data = 3452.345;
        System.out.println("Double - " + data);
         int s = 2344;
         double p = s;
        // convert into int
        int value = (int)data;
 
        // print the int value
        System.out.println("Integer - " + value+","+p);
        
        long l=500;  
        int i=(int)l;  
        System.out.println(i);  
         int n1= 234;
         long l2 = n1;
         System.out.println(l2);	
         int intTen = 10;
         Long longTen = (long) intTen;
         System.out.println(longTen);	
         
         
         	 ArrayList<Employee> arr= new ArrayList<>();
         	 arr.add(new Employee(1,28));
         	 arr.add(new Employee(2,34));
    List<Employee> list = arr.stream().filter(pp->pp.getSalary()<30).collect(Collectors.toList());
         	 
         	 
         	System.out.println(list); 
         	
         	String st = " pap ap appaa ap d pap aad ";
         	String[] as = st.split(" ");
         	HashSet<String> hesS= new HashSet<String>();
         	for(String ss:as) {
         	hesS.add(ss);
         	}
         	System.out.println(hesS);
         
	}
}