package com.expensecontrol.appclean;

import com.expensecontrol.appclean.entity.Expense;
import com.expensecontrol.appclean.port.ExpenseRepository;

public class CreateExpense {
    private final ExpenseRepository repository;

    public CreateExpense(ExpenseRepository repository) {
        this.repository = repository;
    }

    public Expense create(final Expense expense) {
        var createdExpense = repository.create(expense);
        return createdExpense;
    }
}
