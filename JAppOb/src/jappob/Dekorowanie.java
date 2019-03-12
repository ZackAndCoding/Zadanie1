package jappob;

public class Dekorowanie {
    Babeczka ciastoDoUdekorowania;

    public Dekorowanie(Babeczka babeczka) {
        this.ciastoDoUdekorowania = babeczka;
    }
    
    public Dekorowanie dodajPoleweCzekoladowa() {
        this.ciastoDoUdekorowania.polewa = "Czekoladowa";
        
        return this;
    }
    
        public Dekorowanie dodajPoleweMarcepanowa() {
        this.ciastoDoUdekorowania.polewa = "Masa marcepanowa";
        
        return this;
    }
    
    public Dekorowanie dodajKokos() {
        this.ciastoDoUdekorowania.posypka.add("Kokos");
        
        return this;
    }
    
    public Dekorowanie dodajCukierki() {
        this.ciastoDoUdekorowania.posypka.add("Cukierki");
        
        return this;
    }
    
    public Dekorowanie dodajPlatki() {
        this.ciastoDoUdekorowania.posypka.add("Czekoladowe płatki");
        
        return this;
    }
    
    public Dekorowanie dodajPianki() {
        this.ciastoDoUdekorowania.posypka.add("Pianki");
        
        return this;
    }
    
    public Dekorowanie dodajRyz() {
        this.ciastoDoUdekorowania.posypka.add("Ryż ekspandowany");
        
        return this;
    }
    
    public Dekorowanie dodajLindorka() {
        this.ciastoDoUdekorowania.nadzienie = "Lindorek";
        
        return this;
    }
    
    public Dekorowanie dodajTruskawka() {
        this.ciastoDoUdekorowania.smak = "Truskawkowa";
        
        return this;
    }
    
    public Babeczka dajGotowaBabeczke() {
        return this.ciastoDoUdekorowania;
    }
}
