package com.expensecontrol.appclean.config;

import com.expensecontrol.appclean.entity.Expense;
import com.expensecontrol.appclean.port.ExpenseRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryExpenseRepository implements ExpenseRepository {
    private final Map<String, Expense> inMemoryDB = new HashMap<>();

    @Override
    public Expense create(Expense expense) {
        inMemoryDB.put(expense.getExp_id(), expense);
        return expense;
    }

}
