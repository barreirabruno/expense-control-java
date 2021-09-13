package br.com.expensecontrol.appclean.config;

import com.expensecontrol.appclean.CreateExpense;
import com.expensecontrol.appclean.db.InMemoryExpenseRepository;
import com.expensecontrol.appclean.port.ExpenseRepository;

public class ManualConfigTest {
    private final ExpenseRepository database = new InMemoryExpenseRepository();

    public CreateExpense createExpense() {
        return new CreateExpense(database);
    }
}
