package com.example.enums;

import lombok.Getter;

@Getter
public enum AddExpense {
    INSTANCE;

    private AddExpense() {}

    public void execute(Expense expense) {
        System.out.println("Executing AddExpense...");
        System.out.println("Added Expense: " + expense);
    }
}
