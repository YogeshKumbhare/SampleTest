package com.company;

import java.util.*;
import java.util.stream.Stream;

public class ComparatorMain {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.add(new Employee("yogesh","k"));
        employees.add(new Employee("ram","t"));

        Spliterator<Employee> spliterator = employees.spliterator();



        Comparator<Employee> groupbycomparator = Comparator.comparing(Employee :: getFirstname)
                .thenComparing(Employee :: getLastName);

        //Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);

       // Arrays.parallelSort(employeesArray,groupbycomparator);
        employees.sort(groupbycomparator);
        System.out.println(employees);
    }


    private static List<Employee> getEmployees(){
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee("Yash", "Chopra"));
        employees.add(new Employee("Aman", "Sharma"));
        employees.add(new Employee("Aakash", "Yaadav"));
        employees.add(new Employee("David", "Kameron"));
        employees.add(new Employee("James", "Hedge"));
        employees.add(new Employee("Balaji", "Subbu"));
        employees.add(new Employee("Karan", "Johar"));
        employees.add(new Employee("Lokesh", "Gupta"));
        employees.add(new Employee("Vishu", "Bissi"));
        employees.add(new Employee("Lokesh", "Ramachandran"));
        return employees;
    }
}
