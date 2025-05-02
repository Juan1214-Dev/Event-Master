/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventmaster_pro;

/**
 *
 * @author JuanMa
 */
public class Artist {
    private String name;
    private String type;
    private String contactInfo;
    private String techRequirements;

    public Artist(String name, String type, String contactInfo, String techRequirements) {
        this.name = name;
        this.type = type;
        this.contactInfo = contactInfo;
        this.techRequirements = techRequirements;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getTechRequirements() {
        return techRequirements;
    }

    public void displayArtistInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Contact: " + contactInfo);
        System.out.println("Tech Requirements: " + techRequirements);
        System.out.println("---------------------------");
    }
}