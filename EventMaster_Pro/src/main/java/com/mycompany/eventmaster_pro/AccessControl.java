/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventmaster_pro;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author JuanMa
 */
public class AccessControl {
    // Map<EventName, Set<AttendeeName>>
    private HashMap<String, HashSet<String>> attendanceRegistry;

    public AccessControl() {
        attendanceRegistry = new HashMap<>();
    }

    public void registerEntry(String eventName, String attendeeName) {
        attendanceRegistry.putIfAbsent(eventName, new HashSet<>());
        attendanceRegistry.get(eventName).add(attendeeName);
        System.out.println("Access granted to " + attendeeName + " for event " + eventName);
    }

    public boolean isAttending(String eventName, String attendeeName) {
        return attendanceRegistry.containsKey(eventName) &&
               attendanceRegistry.get(eventName).contains(attendeeName);
    }

    public void showAttendanceStats(String eventName) {
        if (attendanceRegistry.containsKey(eventName)) {
            int count = attendanceRegistry.get(eventName).size();
            System.out.println("Event: " + eventName);
            System.out.println("Total Attendees: " + count);
        } else {
            System.out.println("No attendance records for this event.");
        }
    }
}