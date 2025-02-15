package es.uah.matcomp.mp.e3.ejerciciosclases;

public class School {

    // Clase interna Person
    public static class Person {

        // Variables
        private String name;
        private String address;

        // Constructores
        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        // Getter
        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        // Setter
        public void setAddress(String address) {
            this.address = address;
        }

        // Procedimiento
        @Override
        public String toString() {
            return "Person[name=" + name + ",address=" + address + "]";
        }
    }

    // Clase interna Student que hereda de Person
    public static class Student extends Person {

        // Variables extra
        private String program;
        private int year;
        private double fee;

        // Constructor
        public Student(String name, String address, String program, int year, double fee) {
            super(name, address);
            this.program = program;
            this.year = year;
            this.fee = fee;
        }

        // Getter
        public String getProgram() {
            return program;
        }

        public int getYear() {
            return year;
        }

        public double getFee() {
            return fee;
        }


        // Setter
        public void setProgram(String program) {
            this.program = program;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        // Procedimiento
        @Override
        public String toString() {
            return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
        }
    }

    // Clase interna Staff que hereda de Person
    public static class Staff extends Person {
        private String school;
        private double pay;

        public Staff(String name, String address, String school, double pay) {
            super(name, address);
            this.school = school;
            this.pay = pay;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public double getPay() {
            return pay;
        }

        public void setPay(double pay) {
            this.pay = pay;
        }

        @Override
        public String toString() {
            return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
        }
    }
}

