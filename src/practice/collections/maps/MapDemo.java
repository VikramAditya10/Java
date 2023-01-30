package practice.collections.maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import practice.collections.model.Employee;
public class MapDemo {
public static void main(String[] args) {
		
Map<String, Employee> empMap = new HashMap<String, Employee>();
List<Employee> empList = new ArrayList<Employee>(); 	
empList.add(new Employee("David",120000.00,35));
empList.add(new Employee("Helen",123232.30,31));
empList.add(new Employee("Joe",20000.00,28));
empList.add(new Employee("Jimmy",130300.50,35));
empList.add(new Employee("Lara",50000.00,20));

empList.forEach(e->empMap.put(e.getName(), e));

empMap.keySet().stream().forEach(e->System.out.println(empMap.get(e).getName() +" "+empMap.get(e).getSalary()+" "+empMap.get(e).getAge()));
// TODO Auto-generated method stub

	}

}
