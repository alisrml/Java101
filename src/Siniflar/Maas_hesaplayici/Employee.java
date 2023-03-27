package Siniflar.Maas_hesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double tax;
        if (salary<1000){
            tax = 0;
        }else {
            tax = salary*0.03;
        }
        return tax;
    }

    public int bonus(int workHours){
        int bonus = 0;
        if (workHours>40){
            bonus = (workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(int hireYear,double salary){
        int todayYear = 2021;
        int workYear = todayYear-hireYear;
        double artis;

        if (workYear<10){
            artis = salary*0.05;
        } else if (workYear<20) {
            artis = salary*0.1;
        }else {
            artis = salary*0.15;
        }
        return artis;
    }

    public String toString(){
        String bilgiler;
        bilgiler = "Adı: "+this.name+"\nMaaşı: "+this.salary+"\nÇalışma saati: "+this.workHours+"\nBaşlangıç Yılı: "+this.hireYear+
                "\nVergi: "+tax(this.salary)+"\nBonus: "+bonus(this.workHours)+"\nMaaş artışı: "+raiseSalary(this.hireYear,this.salary)+
        "\nVergi ve Bonuslar ile birlikte maaş: "+(this.salary-tax(this.salary)+bonus(this.workHours)+"\nToplam maaş: "+(this.salary+raiseSalary(this.hireYear,this.salary)));
        return bilgiler;
    }
}
