import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(100,"Nilesh Narkhede","RSS"));
		list.add(new Employee(101,"Suarj bendale","HR"));
		list.add(new Employee(102,"rupesh talele","EDS"));
		list.add(new Employee(103,"chirag chu","Marketing"));
		list.add(new Employee(104,"yash sk","Admin"));
		list.add(new Employee(105,"yogesh patil","head"));
		
		 Collections.sort(list); 
		 
		/*
		 * for(Employee emp : list) { System.out.println(emp.getEmpID() + " " +
		 * emp.getEmpName() + " " + emp.getEmdepartment()); }
		 */

		 class NameCompare implements Comparator<Employee>{

				@Override
				public int compare(Employee arg0, Employee arg1) {
					if(arg0.getEmpName().equals(arg1.getEmpName())) {
						return -1;
					} else {
						return 1;
					}
					
				}
				
			}
		 
		 NameCompare name = new NameCompare();
		 Collections.sort(list, name);
		 for(Employee emp : list) {
			 System.out.println(emp.getEmpID() + " " + emp.getEmpName() + " " + emp.getEmdepartment());
		 }
		 
	}
}
