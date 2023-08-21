package org.git.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.id == employee.id){
            return 0;
        } else if (this.id >employee.id) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparableComparatorExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(5,"wasim");
        Employee employee2 = new Employee(1,"asim");
        Employee employee3 = new Employee(0,"aaasim");

        List<Employee> employeeList = Arrays.asList(employee1,employee2,employee3);

        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
               return employee1.name.compareTo(employee2.name);
            }
        };

        //sorting by comparator
        //Collections.sort(employeeList);

        Collections.sort(employeeList,comparator);



        System.out.println(employeeList);

    }
}
