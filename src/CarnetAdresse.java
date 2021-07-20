public class CarnetAdresse {
    private String lastName ;
    private String firstName;
    private String adress;

//    public CarnetAdresse(){
//        lastName ="test";
//        firstName ="test";
//        adresse= "test";
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


}
