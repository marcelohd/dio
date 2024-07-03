import type.IPhone;
import type.IPod;

public class Main {
    public static void main(String[] args) {
        
        IPhone iPhone = new IPhone("358632952620506");
        iPhone.call("0800 21 0800");
        iPhone.answer();
        iPhone.voiceMail();

        System.out.println("\n");

        iPhone.showPage("www.web.dio.me");
        iPhone.addNewTab();
        iPhone.refreshPage();

        System.out.println("\n");

        iPhone.play();
        iPhone.pause();
        iPhone.selectMusic("TU ES - FHOP");


    }
}
