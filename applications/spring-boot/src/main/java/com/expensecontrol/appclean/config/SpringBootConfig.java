package com.expensecontrol.appclean.config;

import com.expensecontrol.appclean.CreateExpense;
import com.expensecontrol.appclean.ExpenseController;
import com.expensecontrol.appclean.db.InMemoryExpenseRepository;
import com.expensecontrol.appclean.port.ExpenseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfig {

    @Bean
    public ExpenseRepository database() {
        return new InMemoryExpenseRepository();
    }

    @Bean
    public CreateExpense createExpense() { return new CreateExpense(this.database()); }

    @Bean
    public ExpenseController expenseController() {
        return new ExpenseController(this.createExpense());
    }
}
