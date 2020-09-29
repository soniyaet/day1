package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreams {
	int employeeID,employeeSalary;
	String employeename;
	public EmployeeStreams(int employeeID,String employeename,int employeeSalary)
	{
		this.employeeID=employeeID;
		this.employeename=employeename;
		this.employeeSalary=employeeSalary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeStreams> employees=new ArrayList<EmployeeStreams>(); 
		employees.add(new EmployeeStreams(101,"abc",2000));
		employees.add(new EmployeeStreams(102,"def",3000));
		employees.add(new EmployeeStreams(103,"ghi",4000));
		Set<EmployeeStreams> employeesSet=employees.stream().filter(n->n.employeeSalary>2000).collect(Collectors.toSet());
		for (EmployeeStreams employee : employeesSet) {
			System.out.println(employee.employeeID+" "+employee.employeename+" "+employee.employeeSalary);
			
		}
	}

}
