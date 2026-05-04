package com.example;

public abstract class Objekt  {
    protected int id;
    protected String typ;
    protected boolean tillgänglig;
    protected String titel;


    public Objekt(int id, String typ, boolean tillgänglig, String titel) {
        this.id = id;
        this.typ = typ;
        this.tillgänglig = tillgänglig;
        this.titel = titel;
    }
    public boolean isTillgänglig() {
        return tillgänglig;
    }
    public void setTillgänglig(boolean tillgänglig) {
        this.tillgänglig = tillgänglig;
    }
}
