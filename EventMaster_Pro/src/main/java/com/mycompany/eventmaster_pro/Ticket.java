/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventmaster_pro;

/**
 *
 * @author JuanMa
 */
public class Ticket {
    
    private String type; // e.g., VIP, General, Backstage
    private double price;
    private int quantity;
    private String eventName;
    
    public Ticket(String type, double price, int quantity, String eventName) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.eventName = eventName;
    }
    
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getEventName() {
        return eventName;
    }

    public void reduceQuantity(int sold) {
        if (sold <= quantity) {
            quantity -= sold;
        }
    }
    
      public void displayTicketInfo() {
        System.out.println("Event: " + eventName);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + quantity);
        System.out.println("---------------------------");
    }
    
    
    
}
