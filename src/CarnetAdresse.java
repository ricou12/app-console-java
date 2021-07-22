import java.util.Date;

public class CarnetAdresse {
    private String lastName ;
    private String firstName;
    private String adress;
    private int age;
    private Date today;

//    public CarnetAdresse(){
//        lastName ="test";
//    }

    public String getLastname(){
        return this.lastName;
    }

    public void setLastName (String newLastName) {
        this.lastName = newLastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getAdress(){
        return this.adress;
    }

    public void setAdress(String newAdresse) {
        this.adress = newAdresse;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Date getToday() {
        return this.today;
    }
}
