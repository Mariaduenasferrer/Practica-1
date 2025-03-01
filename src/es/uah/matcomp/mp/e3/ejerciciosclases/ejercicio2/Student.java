package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio2;

public class Student extends Person {

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
