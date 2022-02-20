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
        String userType = sc.next().toLowerCase();
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
        System.out.printf("Date of Birth, mm/dd/yyyy: ");
        birthday = sc.next();
        System.out.printf("Gender: ");
        gender = sc.next();
        System.out.printf("Race: ");
        race = sc.next();
        System.out.printf("Marital Status: ");
        marStat = sc.next();
        System.out.printf("Ethnicity: ");
        ethnicity = sc.next();
        sc.nextLine();
        System.out.printf("Full Address 'Street City State Zip': ");
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
        needInterp = sc.next().toLowerCase();
        System.out.printf("Hearing or Visually Impaired? (yes/no) ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("Hearing or Visual: ");
            impaired = sc.next();
        } 
        System.out.printf("Physician Name: ");
        sc.nextLine();
        physician = sc.nextLine();
        String data = "INSERT INTO user_info (first_name, last_name, socialSec, birthday, gender, race, marStat, " +
                "ethnicity, fullAdr, lang, phone, email, bloodType, needInterp, impaired, physician) " +
                "VALUES ('" + firstName + "', '" + lastName + "', '" + socialSec + "', '"+ birthday +"', '" + gender + "', '" + race +
                "', '" + marStat + "', '" + ethnicity + "', '" + fullAdr + "', '" + lang + "', '" + phone + "', '" + email + "', '" + bloodType +
                "', '" + needInterp + "', '" + impaired + "', '" + physician + "');";
        Database.insertData(data);
    }

    public void work() {
        String employer, occupation, businessNumber, employerAddress;

        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 2 : WORK INFORMATION\n");
        System.out.printf("Employer: ");
        employer = sc.next();
        System.out.printf("Occupation: ");
        occupation = sc.next();
        System.out.printf("Business Number, (555) 555-5555: ");
        businessNumber = sc.next();
        sc.nextLine();
        System.out.printf("Employer Address 'Street City State Zip': ");
        employerAddress = sc.nextLine();
    }

    public void emergencyContact() {
        String firstName, lastName, relationship, homeNumb, workNumb, cellNumb;
        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 4 : EMERGENCY CONTACT\n");
        System.out.printf("Emergency Contact(EC) First_Name Last_Name: ");
        firstName = sc.next();
        lastName = sc.next();
        System.out.printf("EC's Home Number, (555) 555-5555: ");
        homeNumb = sc.nextLine();
        sc.nextLine();
        System.out.printf("EC's Work Number, (555) 555-5555: ");
        workNumb = sc.nextLine();
        System.out.printf("EC's Cell Number, (555) 555-5555: ");
        cellNumb = sc.nextLine();
    }

    public void insurance(){
        String primaryInsur, phFirst, phLast, relation, subID, groupNumb, socSec, dateOB;
        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 5 : INSURANCE\n");
        System.out.printf("Primary Insurance Company: ");
        primaryInsur = sc.nextLine();
        System.out.printf("Policy Holder First_Name Last_Name: ");
        phFirst = sc.next();
        phLast = sc.next();
        System.out.printf("Relation to Patient: ");
        relation = sc.next();
        System.out.printf("Subscriber ID: ");
        subID = sc.next();
        System.out.printf("Group Number: ");
        groupNumb = sc.next();
        System.out.printf("Social Security Number: ");
        socSec = sc.next();
        sc.nextLine();
        System.out.printf("Policy Holder Date of Birth, mm/dd/yyyy: ");
        dateOB = sc.nextLine();
    }

    public void medicalHistory(){
        String poaFirst, poaLast, doNR, cancerTreatment, mentalIll, otherIll;
        //String conditions[] = {"Addiction", "Anemia", "Anxiety", "Arhtritis/Gout", "Asthma", "Bipolar", "Colon Disease", "Congestive Heart Failure", "COPD/Emphysema", "Dementia", "Depression", "Diabetes", "Enlarged Prostate", "Reflux/GERD", "Blood Clot", " Heart Attack", "Hepatitis A", "Hepatitis B", "Hepatitis C", "Hepatitis D", "Hepatitis E", "High Cholesterol", "High Blood Pressure", "Irritable Bowel Syndrome", "Kidney Disease", "Kidney Stones", "Liver Disease", "Migraines", "Osteoporosis", "Parkinson's Disease", "Pulmonary Embolism", "Schizophrenia", "Skin Disease", "Stroke", "Thyroid Disease"};
        //move along array ask "Does [indice of condition] apply to you?" save yes values in set and pull them later for data collection?//
        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 5 : CURRENT MEDICAL HISTORY\n");
        System.out.printf("Do you have a Power of Attorney for Healthcare?: ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("First_Name Last_Name: ");
            poaFirst = sc.next();
            poaLast = sc.next();
        }
        System.out.printf("Do you have an active Do Not Resuscitate Order?: ");
        doNR = sc.next();
        System.out.printf("Are you undergoing any Cancer Treatment?: ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("What Type: ");
            cancerTreatment = sc.next();
            sc.nextLine();
        }
        System.out.printf("Have you been diagnosed with a Mental Illness?: ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("What Type: ");
            mentalIll = sc.next();
            sc.nextLine();
        }
        System.out.printf("Is there any other illness you have that is not listed above?; ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("What is it?: ");
            otherIll = sc.next();
        }
        //String majorSurgHosp[] = {"Appendectomy", "Coronary Artery Bypass (Open Heart)", "Cholecystemectomy", "Bariatric Type:", "Hysterectomy", "Mastextomy", "Nephrectomy", "Splenectomy", " Tonsillectomy/Adenoidectomy", "Other Surgeries". "Other Hospitalizations"};
        //another hashset maybe? ask them each one one by one like "Have you ever had a [whatever indice of the surgery]" prompt a yes or no put yes in a set and move until array ends. For others if other is yes prompt for a systme input of what type//
        //String familyMed[] = {"Alcoholism", "Anemia", "Asthma", "Blood Disorder", "Cancer Type", "Stroke", "Dementia", "Diabetes", "Heart Disease", "High Cholesterol", "High Blood Pressure", "Kidney Disease", "Mental Illness", "Osteoporosis", "Heart Attack <50 years of age", "Seizures/Epilepsy", "Thyroid Problems", "Other:"};


        
    }

    public void closeScanner(){
        sc.close();
    }
}
