package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio3;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee( int i, String f, String l, int s){
        id = i;
        firstName = f;
        lastName = l;
        salary = s;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;

    }

    public String getName(){

        return this.getFirstName()+ " " +this.getLastName();
    }


    public int getSalary() {
        return salary;

    }

    public void setSalary(int newSalary) {
        salary = newSalary;

    }

    public int getAnnualSalary(){
        return salary * 12;

    }

    public int raiseSalary(int percent) {
        this.salary += (this.salary * percent) / 100;
        return this.salary;

    }



    public String toString() {
        return "Employee[id = " + this.getId()+ ", name= " + this.getName()+ ", salary=" + this.getSalary()+ " ]";
    }



}


