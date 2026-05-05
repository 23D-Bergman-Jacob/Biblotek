package com.example;

public class Magasin extends Objekt{
    private int upplaga;
    private String kategori;
    private int tryckår;


    public Magasin(int id, String typ, boolean isAvailable, String title, int upplaga, String kategori,
            int tryckår) {
        super(id, "magasin", isAvailable, title);
        this.upplaga = upplaga;
        this.kategori = kategori;
        this.tryckår = tryckår;
    }


    @Override
    public String toString() {
        return "Magasin [id=" + id + ", upplaga=" + upplaga + ", typ=" + typ + ", kategori=" + kategori
                + ", tillgänglig=" + isAvailable + ", tryckår=" + tryckår + ", titel=" + title + "]";
    }


    public String getKategori() {
        return kategori;
    }


    public int getTryckår() {
        return tryckår;
    }


}
