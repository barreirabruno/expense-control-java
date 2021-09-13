package com.expensecontrol.appclean.port;

import com.expensecontrol.appclean.entity.Expense;

public interface ExpenseRepository {
    Expense create(Expense expense);
}
