/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventmaster_pro;

/**
 *
 * @author JuanMa
 */
public class Finance {
    private String eventName;
    private double budget;
    private double income;
    private double expenses;

    public Finance(String eventName, double budget) {
        this.eventName = eventName;
        this.budget = budget;
        this.income = 0;
        this.expenses = 0;
    }

    public void addIncome(double amount) {
        income += amount;
    }

    public void addExpense(double amount) {
        expenses += amount;
    }

    public double getRemainingBudget() {
        return budget + income - expenses;
    }

    public void displayFinanceInfo() {
        System.out.println("Finance for event: " + eventName);
        System.out.println("Initial Budget: $" + budget);
        System.out.println("Total Income: $" + income);
        System.out.println("Total Expenses: $" + expenses);
        System.out.println("Remaining: $" + getRemainingBudget());
        System.out.println("---------------------------");
    }

    public String getEventName() {
        return eventName;
    }
}
