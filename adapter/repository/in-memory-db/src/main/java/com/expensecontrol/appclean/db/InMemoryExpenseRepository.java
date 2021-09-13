package com.expensecontrol.appclean.db;

import com.expensecontrol.appclean.entity.Expense;
import com.expensecontrol.appclean.port.ExpenseRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryExpenseRepository implements ExpenseRepository {

    private final Map<String, Expense> inMemoryDb = new HashMap<>();

    @Override
    public Expense create(Expense expense) {
        inMemoryDb.put(expense.getExp_id(), expense);
        return expense;
    }
}
