package com.example;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import kong.unirest.Unirest;
import kong.unirest.HttpResponse;
import kong.unirest.UnirestException;

import java.nio.file.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String baseURL = "http://10.151.168.5:3110/"; 
        HttpResponse<String>test;

        Gson gson = new Gson();
        System.out.println("Böcker från tidningen");
        Böcker();
        try {
            test = Unirest.get(baseURL+"books/1").asString();            
        } catch (UnirestException e) {
            IO.println("kunde ej koppla upp " + e.getLocalizedMessage());
            return;
        }
        System.out.println(test.getBody());
        Bok exbok = gson.fromJson(test.getBody(), Bok.class);
        System.out.println(exbok);
    }

    static void Böcker()
    {
        System.out.println("");
    }
    
}