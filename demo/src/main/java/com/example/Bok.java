package com.example;

public class Bok extends Objekt {
   private int pages;
   private String genre;
   private String author;

   public Bok(){
    super();
   }

   public Bok(int id, String typ, boolean isAvailable, String title, int pages, String genre, String författare) {
    super(id, "bok", isAvailable, title);
    this.pages = pages;
    this.genre = genre;
    this.author = författare;
   }

   public String getGenre() {
    return genre;
}

   public String getFörfattare() {
    return author;
   }

   @Override
   public String toString() {
    return "Bok [sidor=" + pages + ", id=" + id + ", genre=" + genre + ", typ=" + "Bok" + ", författare=" + author
            + ", tillgänglig=" + isAvailable + ", titel=" + title + "]";
   }
   
}
