
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    int mesai;
    double artis;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            vergi = this.salary * 0.03;
        } else {
            vergi = 0;
        }
        return vergi;
    }

    double bonus() {
        if (this.workHours > 40) {
            mesai = (this.workHours - 40) * 30;
        } else {
            mesai = 0;
        }
        return mesai;
    }

    double raiseSalary() {
        int yil = 2021 - this.hireYear;

        if (yil < 10) {
            artis = this.salary * 0.05;
        } else if (yil > 9 && yil < 20) {
            artis = this.salary * 0.10;
        } else if (yil > 19) {
            artis = this.salary * 0.15;
        }
        return artis;
    }

    @Override
    public String toString() {
        return "Adı: " + this.name + "\nMaaş: " + this.salary + "\nÇalışma Saati: " + this.workHours
                + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi Tutarı: " + tax() + "\nBonus Tutarı: " + bonus()
                + "\nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: "
                + (this.salary - tax() + bonus()) + "\nToplam Maaş: " + (this.salary - tax() + bonus() + raiseSalary());
    }
}
