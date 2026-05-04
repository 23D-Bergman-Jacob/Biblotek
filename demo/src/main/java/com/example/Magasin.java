package com.example;

public class Magasin extends Objekt{
    private int upplaga;
    private String kategori;
    private int tryckår;


    public Magasin(int id, String typ, boolean tillgänglig, String titel, int upplaga, String kategori,
            int tryckår) {
        super(id, typ, tillgänglig, titel);

        this.upplaga = upplaga;
        this.kategori = kategori;
        this.tryckår = tryckår;
    }


}
