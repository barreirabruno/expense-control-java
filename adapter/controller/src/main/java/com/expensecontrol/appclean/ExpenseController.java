package com.expensecontrol.appclean;

import com.expensecontrol.appclean.presenter.ExpensePresenter;

public class ExpenseController {

    private final CreateExpense createExpense;

    public ExpenseController(CreateExpense createExpense) {
        this.createExpense = createExpense;
    }

    public ExpensePresenter createExpense(ExpensePresenter expensePresenter) {
        var expense = createExpense.create(ExpensePresenter.mapToExpense(expensePresenter));

        return ExpensePresenter.mapToExpenseModel(expense);
    }
}
