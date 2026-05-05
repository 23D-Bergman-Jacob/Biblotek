package com.example;

public abstract class Objekt  {
    protected int id;
    protected String typ;
    protected boolean isAvailable;
    protected String title;

    public Objekt()
    {
        // behövs för gson
    }

    public Objekt(int id, String typ, boolean tillgänglig, String title) {
        this.id = id;
        this.typ = typ;
        this.isAvailable = tillgänglig;
        this.title = title;
    }
    public boolean isTillgänglig() {
        return isAvailable;
    }
    public void setTillgänglig(boolean tillgänglig) {
        this.isAvailable = tillgänglig;
    }
}
