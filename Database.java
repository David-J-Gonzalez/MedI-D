package com.Hackathon;
import java.sql.*;

public class Database {
    
    public static void insertData(String data){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medi_d","root","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate(data);

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
    
    public static int retrieveData(String data, int type){
        int key = -1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medi_d","root","");
            Statement stmt=con.createStatement();
            ResultSet rs =stmt.executeQuery(data);
            switch (type) {
                case 0:
                    key = user_info(rs);
                    break;
                case 1:
                    work_info(rs);
                    break;
                case 2:
                    ec_info(rs);
                    break;
                case 3:
                    insur_info(rs);
                    break;
                case 4:
                    med_hist(rs);
                    break;
                default:
                    break;
            }

            con.close();
        }catch(Exception e){ System.out.println(e);}
        return key;
    }
    
    private static int user_info(ResultSet rs) throws SQLException {
        rs.next();
        System.out.printf("User Id =" + rs.getInt("user_id")+ "\n");
        System.out.printf("First Name: " + rs.getString("first_name")+ "\n");
        System.out.printf("Last Name: " + rs.getString("last_name")+ "\n");
        System.out.printf("Social Security No: " + rs.getString("socialSec")+ "\n");
        System.out.printf("Birthday: " + rs.getString("birthday")+ "\n");
        System.out.printf("Gender: " + rs.getString("gender")+ "\n");
        System.out.printf("Race: " + rs.getString("race")+ "\n");
        System.out.printf("Marital Status: " + rs.getString("marStat")+ "\n");
        System.out.printf("Ethnicity: " + rs.getString("ethnicity")+ "\n");
        System.out.printf("Full Address: " + rs.getString("fullAdr")+ "\n");
        System.out.printf("Languages : " + rs.getString("lang")+ "\n");
        System.out.printf("Phone Number: " + rs.getString("phone")+ "\n");
        System.out.printf("Email Address: " + rs.getString("email")+ "\n");
        System.out.printf("BloodType: " + rs.getString("bloodType")+ "\n");
        System.out.printf("Interpreter Needed? " + rs.getString("needInterp") + "\n");
        System.out.printf("Type of Impairment: " + rs.getString("impaired")+ "\n");
        System.out.printf("Physician's Name: " + rs.getString("physician")+ "\n");
        return rs.getInt("user_id");
    }
    
    private static void work_info(ResultSet rs) throws SQLException {
        rs.next();
        System.out.printf("User Id =" + rs.getInt("user_id")+ "\n");
        System.out.printf("Employer: " + rs.getString("employ")+ "\n");
        System.out.printf("Occupation: " + rs.getString("occupation")+ "\n");
        System.out.printf("Work Phone Number: " + rs.getString("business_number")+ "\n");
        System.out.printf("Employer Address: " + rs.getString("employer_address")+ "\n");
    }

    private static void ec_info(ResultSet rs) throws SQLException {
        rs.next();
        System.out.printf("User Id =" + rs.getInt("user_id")+ "\n");
        System.out.printf("First Name: " + rs.getString("first_name")+ "\n");
        System.out.printf("Last Name: " + rs.getString("last_name")+ "\n");
        System.out.printf("Relationship: " + rs.getString("relationship")+ "\n");
        System.out.printf("Home Phone Number: " + rs.getString("home")+ "\n");
        System.out.printf("Work Phone Number: " + rs.getString("work")+ "\n");
        System.out.printf("Cell Phone Number: " + rs.getString("cell")+ "\n");
    }
    
    private static void insur_info(ResultSet rs) throws SQLException {
        rs.next();
        System.out.printf("User Id =" + rs.getInt("user_id")+ "\n");
        System.out.printf("Insurance Company: " + rs.getString("insurance_company")+ "\n");
        System.out.printf("Policy Holder's First Name: " + rs.getString("first_name")+ "\n");
        System.out.printf("Policy Holder's Last Name: " + rs.getString("last_name")+ "\n");
        System.out.printf("Relationship: " + rs.getString("relationship")+ "\n");
        System.out.printf("Subscriber Id: " + rs.getString("sub_id")+ "\n");
        System.out.printf("Group Id: " + rs.getString("group_no")+ "\n");
        System.out.printf("Policy Holder's SSN: " + rs.getString("ssn")+ "\n");
        System.out.printf("Policy Holder's DoB: " + rs.getString("dob")+ "\n");
    }

    private static void med_hist(ResultSet rs) throws SQLException {
        rs.next();
        System.out.printf("User Id =" + rs.getInt("user_id") + "\n");
        System.out.printf("Power of Attorney's First Name: " + rs.getString("pfirst_name") + "\n");
        System.out.printf("Power of Attorney's Last Name: " + rs.getString("plast_name") + "\n");
        System.out.printf("Do Not Resuscitate: " + rs.getString("dnr") + "\n");
        System.out.printf("Cancer Treatment: " + rs.getString("cancer") + "\n");
        System.out.printf("Pre-existing Conditions: " + rs.getString("conditions") + "\n");
        System.out.printf("Mental Illness: " + rs.getString("mental") + "\n");
        System.out.printf("Other Conditions: " + rs.getString("other") + "\n");
        System.out.printf("Major Hospitalizations: " + rs.getString("major_hs") + "\n");
        System.out.printf("Family History: " + rs.getString("fam_hist") + "\n");
        System.out.printf("Current Medication: " + rs.getString("meds") + "\n");
        System.out.printf("Allergies: " + rs.getString("allergies") + "\n");
    }
}
