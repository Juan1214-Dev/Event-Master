/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eventmaster_pro;

import java.util.*;

/**
 *
 * @author JuanMa
 */
public class EventMaster_Pro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Event> events = new ArrayList<>();
        ArrayList<Artist> artists = new ArrayList<>();
        ArrayList<Place> places = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Finance> finances = new ArrayList<>();
        AccessControl accessControl = new AccessControl();

        boolean exit = false;

        while (!exit) {
            System.out.println("EventMaster Pro Menu");
            System.out.println("1) Create Event");
            System.out.println("2) Register Artist");
            System.out.println("3) Register Place");
            System.out.println("4) Create Ticket");
            System.out.println("5) Register Entry (Access Control)");
            System.out.println("6) Finance Management");
            System.out.println("7) View Events");
            System.out.println("8) Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    System.out.print("Event name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Time (HH:MM): ");
                    String time = scanner.nextLine();
                    System.out.print("Location: ");
                    String location = scanner.nextLine();

                    Event event = new Event(eventName, category, date, time, location);
                    events.add(event);

                    System.out.print("Budget for this event: ");
                    double budget = scanner.nextDouble();
                    scanner.nextLine();
                    finances.add(new Finance(eventName, budget));

                    System.out.println("Event created successfully.\n");
                    break;

                case 2:
                    System.out.print("Artist name: ");
                    String artistName = scanner.nextLine();
                    System.out.print("Type: ");
                    String type = scanner.nextLine();
                    System.out.print("Contact info: ");
                    String contact = scanner.nextLine();
                    System.out.print("Requirements: ");
                    String tech = scanner.nextLine();

                    Artist artist = new Artist(artistName, type, contact, tech);
                    artists.add(artist);

                    System.out.println("Artist registered.\n");
                    break;

                case 3:
                    System.out.print("Place name: ");
                    String placeName = scanner.nextLine();
                    System.out.print("Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tech features: ");
                    String features = scanner.nextLine();

                    Place place = new Place(placeName, capacity, features);

                    System.out.print("Add available date (YYYY-MM-DD): ");
                    String availableDate = scanner.nextLine();
                    place.addAvailableDate(availableDate);

                    places.add(place);
                    System.out.println("Place registered.\n");
                    break;

                case 4:
                    System.out.print("Event name for ticket: ");
                    String ticketEvent = scanner.nextLine();
                    System.out.print("Ticket type (VIP, General, Common.): ");
                    String ticketType = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    tickets.add(new Ticket(ticketType, price, quantity, ticketEvent));
                    System.out.println("Ticket created.\n");
                    break;

                case 5:
                    System.out.print("Event name: ");
                    String accessEvent = scanner.nextLine();
                    System.out.print("Attendee name: ");
                    String attendee = scanner.nextLine();

                    accessControl.registerEntry(accessEvent, attendee);
                    break;

                case 6:
                    System.out.print("Event name: ");
                    String financeEvent = scanner.nextLine();
                    Finance foundFinance = null;

                    for (Finance f : finances) {
                        if (f.getEventName().equalsIgnoreCase(financeEvent)) {
                            foundFinance = f;
                            break;
                        }
                    }

                    if (foundFinance != null) {
                        System.out.println("1. Add income");
                        System.out.println("2. Add expense");
                        System.out.print("Option: ");
                        int finOp = scanner.nextInt();
                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        if (finOp == 1) {
                            foundFinance.addIncome(amount);
                        } else if (finOp == 2) {
                            foundFinance.addExpense(amount);
                        }

                        foundFinance.displayFinanceInfo();
                    } else {
                        System.out.println("Event not found in finance records.");
                    }
                    break;

                case 7:
                    for (Event e : events) {
                        e.displayEventInfo();

                        // Show Artists
                        System.out.println("Artists:");
                        for (Artist a : artists) {
                            System.out.println("- " + a.getName() + " (" + a.getType() + ")");
                        }

                        // Show Tickets for this event
                        System.out.println("Tickets:");
                        for (Ticket t : tickets) {
                            if (t.getEventName().equalsIgnoreCase(e.getName())) {
                                System.out.println("- " + t.getType() + ": $" + t.getPrice() + ", Quantity: " + t.getQuantity());
                            }
                        }

                        // Show Finance info
                        System.out.println("Finance:");
                        for (Finance f : finances) {
                            if (f.getEventName().equalsIgnoreCase(e.getName())) {
                                f.displayFinanceInfo();
                            }
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting EventMaster Pro");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
