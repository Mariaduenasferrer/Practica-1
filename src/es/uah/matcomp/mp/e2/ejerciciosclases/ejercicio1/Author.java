package es.uah.matcomp.mp.e2.ejerciciosclases.ejercicio1;

public class Author {
    private String name;
    private String email;


    public Author(String name, String email ) {
        this.name = name;
        this.email = email;
    }
    public String getName() {

        return name;
    }
    public String getEmail() {

        return email;
    }
    public void setEmail(String newEmail) {

        email= newEmail;
    }
    public String toString() {
        return "Author[name= " + this.getName() + " , email= " + this.getEmail() + "]";
    }

}


