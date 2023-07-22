import java.util.Date;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double taxpercentage = 0.03;
        double tax;
        if (salary > 1000) {
            tax = salary * taxpercentage;
        } else {
            System.out.println("Vergi Uygulanmayacaktır");
            tax = 0;
        }
        return tax;
    }

    public int Bonus() {
        int BonusPaid;
        if (workHours > 40) {
            int exceedtime = workHours - 40;
            BonusPaid = exceedtime * 30;
        } else {
            BonusPaid = 0;
        }
        return BonusPaid;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        double raiseSalary = 0;
        if (currentYear - hireYear < 10) {
            raiseSalary = (salary * 0.05);
        }
        if ((9 < (currentYear - hireYear)) && ((hireYear - currentYear) < 20)) {
            raiseSalary = (salary * 0.1);
        }
        if ((currentYear - hireYear) > 19) {
            raiseSalary = (salary * 0.15);
        }
        return raiseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}

