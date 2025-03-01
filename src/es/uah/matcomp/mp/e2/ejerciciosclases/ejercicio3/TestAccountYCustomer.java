package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio3;

public class TestAccountYCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "María Dueñas", 'F');
        System.out.println(c1);
        System.out.println("ID="+ c1.getId()+ ", name="+ c1.getName()+ ", gender="+ c1.getGender() );
        Customer c2 = new Customer(2, "Pedro Pérez", 'M');
        System.out.println(c2);
        System.out.println(", ID="+ c2.getId()+ ", name="+ c2.getName()+ " , gender="+ c2.getGender() );

        Account a1 = new Account(101, c1, 500.0);
        System.out.println(a1);
        Account a2 = new Account(102, c2);
        System.out.println(a2);
        a1.setBalance(87);
        System.out.println("id= "+ a1.getId()+ "customer="+ a1.getCustomer()+ "balance="+ a1.getBalance() );
        System.out.println( a1.getCustomerName());
        System.out.println(a1.deposit(500.0) );
        System.out.println(a1.withdraw(500));

    }

}


