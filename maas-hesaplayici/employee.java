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
    public double tax(){
        double tax = 0;
        if (this.salary>1000){
            tax = salary*0.03;
        }
        return tax;
    }
    public double bonus(){
        double bonus = 0;
        if (workHours>40){
            bonus = (workHours-40)*30;
        }
        return bonus;
    }
    public double raiseSalary(){
        double raise;
        if((2021-hireYear)<10){
            raise = salary*0.05;
        } else if ((2021-hireYear)>=10 && (2021-hireYear)<20){
            raise = salary*0.10;
        } else {
            raise = salary*0.15;
        }
        return raise;
    }

    public String toString(){

        double total = salary-tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        System.out.println("Adı: "+name);
        System.out.println("Maaşı: "+ salary);
        System.out.println("Çalışma Saati: "+ workHours);
        System.out.println("Başlangıç Yılı: "+hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: "+tot);
        System.out.println("Toplam Maaş: "+total);
        return "";
    }
}
