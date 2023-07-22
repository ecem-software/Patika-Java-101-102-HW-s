// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Ahmet",10000,70,2010);

        System.out.println( employee.toString());
        System.out.println(employee.raiseSalary());
        System.out.println(employee.Bonus());
        System.out.println(employee.tax());
        }
    }
