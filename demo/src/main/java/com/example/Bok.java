package com.example;

public class Bok extends Objekt {
   private int sidor;
   private String genre;
   private String författare;

   public Bok(int id, String typ, boolean tillgänglig, String titel, int sidor, String genre, String författare) {
    super(id, typ, tillgänglig, titel);
    this.sidor = sidor;
    this.genre = genre;
    this.författare = författare;
   }
}
