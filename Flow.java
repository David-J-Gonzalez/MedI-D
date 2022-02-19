import java.util.Scanner;

public class Flow {
    Scanner sc;
    public void openScanner(){
        sc = new Scanner(System.in);
    }
    public boolean intro() {
        System.out.printf("<3 Loading...<3\n");
        System.out.printf("Welcome to the MedI-D prototype!\n");
        System.out.printf("Are you a new user? ");
        String userType = sc.next();
        if (userType.equals("yes")){
            return true;
        } else {
            return false;
        }   
    }

    public void basicInfo() {
        String firstName, lastName, socialSec, birthday, gender, race, marStat, ethnicity, fullAdr,
        lang, phone, email, bloodType, needInterp, impaired, physician;
        
        System.out.printf("Great, lets get started!\n");
        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 1 : BASIC INFORMATION\n");
        System.out.printf("First_Name Last_Name: ");
        firstName = sc.next();
        lastName = sc.next();
        System.out.printf("SSN: ");
        socialSec = sc.next();
        System.out.printf("Birthdate, mm/dd/yyyy: ");
        birthday = sc.next();
        System.out.printf("Gender: ");
        gender = sc.next();
        System.out.printf("Race: ");
        race = sc.next();
        System.out.printf("Marital Status: ");
        marStat = sc.next();
        System.out.printf("Ethnicity: ");
        ethnicity = sc.next();
        System.out.printf("Full Address, Street, City, State Zip: ");
        fullAdr = sc.nextLine();
        System.out.printf("Languages: ");
        lang = sc.nextLine();
        System.out.printf("Phone, (555) 555-5555: ");
        phone = sc.nextLine();
        System.out.printf("Email: ");
        email = sc.next();
        System.out.printf("Blood Type: ");
        bloodType = sc.next();
        System.out.printf("Do you need an Interpreter? ");
        needInterp = sc.next();
        System.out.printf("Hearing or Visually Impaired? (yes/no) ");
        if(sc.next().equals("yes")){
            System.out.printf("Hearing or Visual: ");
            impaired = sc.next();
        } 
        System.out.printf("Physician Name: ");
        physician = sc.nextLine();
    }


    public void closeScanner(){
        sc.close();
    }
}
