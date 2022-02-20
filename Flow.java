package com.Hackathon;

import java.util.ArrayList;
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
        } else {
            impaired = "none";
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
        employer = sc.nextLine();
        System.out.printf("Occupation: ");
        occupation = sc.nextLine();
        System.out.printf("Business Number, (555) 555-5555: ");
        businessNumber = sc.nextLine();
        System.out.printf("Employer Address 'Street City State Zip': ");
        employerAddress = sc.nextLine();
        String data = "INSERT INTO work_info (employ, occupation, business_number, employer_address) " +
                "VALUES ('" + employer + "', '" + occupation + "', '" + businessNumber + "', '"+ employerAddress +  "');";
        Database.insertData(data);
    }

    public void emergencyContact() {
        String firstName, lastName, relationship, homeNumb, workNumb, cellNumb;
        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 4 : EMERGENCY CONTACT\n");
        System.out.printf("Emergency Contact(EC) First_Name Last_Name: ");
        firstName = sc.next();
        lastName = sc.next();
        System.out.printf("Relationship: ");
        relationship = sc.next();
        sc.nextLine();
        System.out.printf("EC's Home Number, (555) 555-5555: ");
        homeNumb = sc.nextLine();
        System.out.printf("EC's Work Number, (555) 555-5555: ");
        workNumb = sc.nextLine();
        System.out.printf("EC's Cell Number, (555) 555-5555: ");
        cellNumb = sc.nextLine();
        String data = "INSERT INTO ec_info (first_name, last_name, relationship, home, work, cell) " +
                "VALUES ('" + firstName + "', '" + lastName + "', '" + relationship + "', '" + homeNumb + "', '" + workNumb + "', '" + cellNumb + "');";
        Database.insertData(data);
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
        String data = "INSERT INTO insur_info (insurance_company, first_name, last_name, relationship, sub_id, group_no, ssn, dob) " +
                "VALUES ('" + primaryInsur + "', '" + phFirst + "', '" + phLast + "', '" + relation + "', '" + subID + "', '" + groupNumb + "', '" + socSec + "', '" + dateOB + "');";
        Database.insertData(data);
    }

    public void medicalHistory(){
        String poaFirst, poaLast, doNR, cancerTreatment, mentalIll, otherIll, meds;
        System.out.printf("--------------------------------------------------------\n");
        System.out.printf("SECTION 5 : CURRENT MEDICAL HISTORY\n");
        System.out.printf("Do you have a Power of Attorney for Healthcare?: ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("First_Name Last_Name: ");
            poaFirst = sc.next();
            poaLast = sc.next();
        } else {
            poaFirst = "none";
            poaLast = "none";
        }
        System.out.printf("Do you have an active Do Not Resuscitate Order?: ");
        doNR = sc.next();
        System.out.printf("Are you undergoing any Cancer Treatment?: ");
        if(sc.next().toLowerCase().equals("yes")){
            System.out.printf("What Type 'CT1 CT2 ...': ");
            sc.nextLine();
            cancerTreatment = sc.nextLine();
        } else cancerTreatment = "none";
        String st[] = {"Addiction ", "Anemia ", "Anxiety ", "Arhtritis/Gout ", "Asthma ", "Bipolar ", "Colon Disease ", "Congestive Heart Failure ", "COPD/Emphysema ", "Dementia ", "Depression ", "Diabetes ", "Enlarged Prostate ", "Reflux/GERD ", "Blood Clot ", "Heart Attack ", "Hepatitis A ", "Hepatitis B ", "Hepatitis C ", "Hepatitis D ", "Hepatitis E ", "High Cholesterol ", "High Blood Pressure ", "Irritable Bowel Syndrome ", "Kidney Disease ", "Kidney Stones ", "Liver Disease ", "Migraines ", "Osteoporosis ", "Parkinson's Disease ", "Pulmonary Embolism ", "Schizophrenia ", "Skin Disease ", "Stroke ", "Thyroid Disease "};
        ArrayList<String> red = new ArrayList<>();
        String conditions = "";
        System.out.printf("For the following conditions type 'y' or 'n' as your response: \n");
        for (int i=0;i<st.length;i++) {
            System.out.printf(st[i]);
            if (sc.next().toLowerCase().equals("y")){
                red.add(st[i]);
            }
        }
        for(String j:red) {
            conditions += j + " ";
        }
        if (conditions.equals("")) conditions = "none";
        System.out.printf("Have you been diagnosed with a Mental Illness?: ");
        if(sc.next().toLowerCase().equals("yes")){
            sc.nextLine();
            System.out.printf("What Type 'MI1 MI2 ...': ");
            mentalIll = sc.nextLine();
        } else mentalIll = "none";
        System.out.printf("Is there any other illness you have that are not listed above?: ");
        if(sc.next().toLowerCase().equals("yes")) {
            System.out.printf("What is it?, 'O1 O2 ...': ");
            sc.nextLine();
            otherIll = sc.nextLine();
        } else otherIll = "none";
        String s[] = {"Appendectomy ", "Coronary Artery Bypass (Open Heart) ", "Cholecystemectomy ", "Bariatric Type: ", "Hysterectomy ", "Mastextomy ", "Nephrectomy ", "Splenectomy ", "Tonsillectomy/Adenoidectomy ", "Other Surgeries ", "Other Hospitalizations "};
        ArrayList<String> res = new ArrayList<>();
        String hospit = "";
        System.out.printf("Regarding the following procedures type y or n as your response.\n");
        for (int i =0; i <s.length; i++) {
            System.out.printf(s[i]);
            String nex = sc.nextLine();
            if (nex.equals("y")) {
                res.add(s[i]);
            }
        } for(String j:res) {
            hospit += j + " ";
        }
        if (hospit.equals("")) hospit = "none";
        String familyHist[] = {"Alcoholism ", "Anemia ", "Asthma ", "Blood Disorder ", "Cancer Type ", "Stroke ", "Dementia ", "Diabetes ", "Heart Disease ", "High Cholesterol ", "High Blood Pressure ", "Kidney Disease ", "Mental Illness ", "Osteoporosis ", "Heart Attack <50 years of age ", "Seizures/Epilepsy ", "Thyroid Problems ", "Other: "};
        ArrayList<String> ret = new ArrayList<>();
        String famhist = "";
        System.out.printf("Type y or n as your response regarding if a family member has these following conditions.\n");
        for (int i =0; i <familyHist.length; i++) {
            System.out.printf(familyHist[i]);
            if (sc.next().equals("y")) {
                ret.add(familyHist[i]);
            }
        }
        for(String j:ret) {
            famhist += j + " ";
        }
        sc.nextLine();
        System.out.printf("What Medications Are you Currently Taking, 'Med1 Med2 ...': ");
        meds = sc.nextLine();
        String aller = "";
        System.out.printf("Do you have unlisted allergy?: ");
        if (sc.next().toLowerCase().equals("yes")) {
            sc.nextLine();
            System.out.printf("Respond with 'Allergen-Severity-Reaction': ");
            aller = sc.nextLine();
            while (true) {
                System.out.printf("Do you have unlisted allergy?: ");
                if (sc.next().toLowerCase().equals("yes")) {
                    System.out.printf("Respond with 'Allergen-Severity-Reaction': ");
                    aller += sc.nextLine();
                } else {
                    break;
                }
            }
        } else aller = "none";

        String data = "INSERT INTO med_hist (pfirst_name, plast_name, dnr, cancer, conditions, mental, other, major_hs, fam_hist, meds, allergies) " +
                "VALUES ('" + poaFirst + "', '" + poaLast + "', '" + doNR + "', '" + cancerTreatment + "', '" + conditions + "', '" + mentalIll + "', '" + otherIll + "', '" + hospit + "', '" +  famhist + "', '" + meds + "', '" +  aller + "');";
        Database.insertData(data);
    }
    
    public void returningUser(){
        String first_name, last_name;
        System.out.printf("Great, a returning user!\n");
        System.out.printf("Insert your first and last name to see your basic info: ");
        first_name = sc.next();
        last_name = sc.next();
        String data = "SELECT * FROM user_info WHERE first_name = '" + first_name + "' AND last_name = '" + last_name + "'";
        int key = Database.retrieveData(data, 0);
        while (true) {
            System.out.printf("Would you like to see more of your user data? ");
            if (sc.next().toLowerCase().equals("yes")) {
                String table = "";
                System.out.printf("Type 0 for basic info, 1 for work info, 2 for emergency contact info, 3 for insurance info, or 4 for medical history. ");
                int type = sc.nextInt();
                switch (type) {
                    case 0:
                        table = "user_info";
                        break;
                    case 1:
                        table = "work_info";
                        break;
                    case 2:
                        table = "ec_info";
                        break;
                    case 3:
                        table = "insur_info";
                        break;
                    case 4:
                        table = "med_hist";
                        break;
                    default:
                        break;
                }
                data = "SELECT * FROM " + table + " WHERE user_id = " + key;
                Database.retrieveData(data, type);
            } else {
                break;
            }
        }
    }

    public void closeScanner(){
        sc.close();
    }
}
