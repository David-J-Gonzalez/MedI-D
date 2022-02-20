package com.Hackathon;
public class Main {
    public static void main(String[] args) throws Exception {
        Flow flow = new Flow();
        flow.openScanner();
        if (flow.intro()) {
            flow.basicInfo();
            flow.work();
            flow.emergencyContact();
            flow.insurance();
            flow.medicalHistory();
            } else {
                flow.returningUser();
            }
        flow.closeScanner();
    }
}
