package com.example;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import kong.unirest.Unirest;
import kong.unirest.HttpResponse;
import kong.unirest.UnirestException;

import java.nio.file.*;
import java.util.ArrayList;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Test();
        String baseURL = "http://10.151.168.5:3110/"; 
        HttpResponse<String>hämtadBok;

        Gson gson = new Gson();
        System.out.println("Böcker från tidningen");
        Böcker();
        int k = 0;
        ArrayList<Bok> böcker = new ArrayList<Bok>();  
        while (true) {
            k++;
            try {
                hämtadBok = Unirest.get(baseURL+"books/" + k).asString();            
            } catch (UnirestException e) {
                IO.println("alla böcker hämtade" + e.getLocalizedMessage());
                break;  
            }
            System.out.println(hämtadBok.getBody());
            Bok exbok = gson.fromJson(hämtadBok.getBody(), Bok.class);
            böcker.add(exbok);
            System.out.println(böcker.get(k-1));
        }
    }

    static void Böcker()
    {
        System.out.println("");
    }

    static String Test()
    {
            String baseURL = "http://10.151.168.5:3110/"; 
            HttpResponse<String>test;
            try {
                test = Unirest.get(baseURL+"books/").asString();            
            } catch (UnirestException e) {
                IO.println("kunde ej koppla upp " + e.getLocalizedMessage());
                return "nej";
            }
        return "ja";
    }
    
}