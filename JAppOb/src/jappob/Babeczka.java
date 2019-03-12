package jappob;
import java.util.ArrayList;

public class Babeczka {
    String polewa;
    ArrayList<String> posypka;
    String nadzienie;
    String smak;
    Boolean czyUpieczona;

    public Babeczka() {
//        System.out.println("Właśnie tworzysz babeczkę :)");
        this.polewa = "";
        this.posypka = new ArrayList<String>();
        this.nadzienie = "";
        this.smak = "";
        this.czyUpieczona = true;
    }
    
    public void upieczBabeczke() {
        this.czyUpieczona = false;
    }
    
    public void pokaz() {
        System.out.println("Polewa: " + this.polewa);
        System.out.println("Posypka: " + this.posypka);
        System.out.println("Nadzienie: " + this.nadzienie);
        System.out.println("Smak: " + this.smak);
        if (this.czyUpieczona == true) {
            System.out.println("Upieczona");
        } else {
            System.out.println("Nie upieczona");
        }
        System.out.println("----------");
    }
}