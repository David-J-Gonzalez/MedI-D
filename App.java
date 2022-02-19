public class App {
    public static void main(String[] args) throws Exception {
        Flow flow = new Flow();
        flow.openScanner();
        if(flow.intro()){
            flow.basicInfo();
        }
        flow.closeScanner();
    }
}   
