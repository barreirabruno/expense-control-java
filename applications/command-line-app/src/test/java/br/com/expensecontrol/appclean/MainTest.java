package br.com.expensecontrol.appclean;

import br.com.expensecontrol.appclean.config.ManualConfigTest;
import com.expensecontrol.appclean.ExpenseController;
import com.expensecontrol.appclean.presenter.ExpensePresenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    private ManualConfigTest config;
    private ExpensePresenter expensePresenter;
    private ExpenseController expenseController;

    @BeforeEach
    void setup() {
        config = new ManualConfigTest();
        expenseController = new ExpenseController(config.createExpense());

        expensePresenter = new ExpensePresenter();
        expensePresenter.setExp_price("99.70");
        expensePresenter.setExp_description("any_description");
        expensePresenter.setExp_category("Food");
        expensePresenter.setExp_date("2021-03-09");
    }

    @Test
    public void should_add_an_expense_on_success() {
        var expenseModelCreated = expenseController.createExpense(this.expensePresenter);

        Assertions.assertNotNull(expenseModelCreated);
    }
}
