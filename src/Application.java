import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        CarnetAdresse carnetAdresse = new CarnetAdresse();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nom");
        String lastName = sc.next();
        carnetAdresse.setLastName(lastName);

        System.out.println("Prénom");
        String firstName = sc.next();
        carnetAdresse.setFirstName(firstName);

        System.out.println("Adresse");
        String adress = sc.next();
        carnetAdresse.setAdress(adress);

        System.out.println("Voici ce que vous avez saisi");
        System.out.println(carnetAdresse.getLastname() + ", "  + carnetAdresse.getFirstName() + ", " + carnetAdresse.getAdress() );
    }
}
