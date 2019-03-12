package jappob;

public class JAppOb {

    public static void main(String[] args) {
        Babeczka mufinka = new Babeczka();
        Babeczka ciastko = new Babeczka();
        
//        mufinka.polewa = "Czekoladowa";
//        ciastko.polewa = "Lukier";
//        
//        mufinka.pokaz();
//        ciastko.pokaz();
//        
//        mufinka.upieczBabeczke();
//        
//        mufinka.pokaz();
//        ciastko.pokaz();
        
        Dekorowanie mojDekorator = new Dekorowanie(ciastko);
//        mojDekorator.dodajPoleweCzekoladowa();
//        mojDekorator.dodajKokos();
        mojDekorator.dodajPoleweCzekoladowa().dodajKokos().dodajCukierki().dodajLindorka() .dodajTruskawka();

//        ciastko = mojDekorator.dajGotowaBabeczke();
//        ciastko.pokaz()
        mojDekorator.dajGotowaBabeczke().pokaz();
    }
    
}
