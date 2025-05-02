/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventmaster_pro;

/**
 *
 * @author JuanMa
 */
public class Event {
    
    private String name;
    private String category;   
    private String date;       
    private String time;      
    private String location;   

    // Constructor
    public Event(String name, String category, String date, String time, String location) {
        this.name = name;
        this.category = category;
        this.date = date;
        this.time = time;
        this.location = location;
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Display event info
    public void displayEventInfo() {
        System.out.println(" Event Details ");
        System.out.println("Name     : " + name);
        System.out.println("Category : " + category);
        System.out.println("Date     : " + date);
        System.out.println("Time     : " + time);
        System.out.println("Location : " + location);
    }
}
    
    

