package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Employee #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();

        // Integer emp = position(list, idToIncrease);
        Employee emp = list.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);

        if(emp != null){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            // list.get(emp).increaseSalary(percentage);
            emp.increaseSalary(percentage);
        }
        else{
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee i : list){
            System.out.println(i);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}