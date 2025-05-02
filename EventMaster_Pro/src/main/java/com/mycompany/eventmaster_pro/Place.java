/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventmaster_pro;

import java.util.HashSet;

/**
 *
 * @author JuanMa
 */
public class Place {
    private String name;
    private int capacity;
    private String techFeatures;
    private HashSet<String> availableDates;
    
     public Place(String name, int capacity, String techFeatures) {
        this.name = name;
        this.capacity = capacity;
        this.techFeatures = techFeatures;
        this.availableDates = new HashSet<>();
    }
     
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTechFeatures() {
        return techFeatures;
    }

    public HashSet<String> getAvailableDates() {
        return availableDates;
    }

    public void addAvailableDate(String date) {
        availableDates.add(date);
    }

    public void removeAvailableDate(String date) {
        availableDates.remove(date);
    }

    public boolean isAvailableOn(String date) {
        return availableDates.contains(date);
    }
     
     
    
    
    
    
}
