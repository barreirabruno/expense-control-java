package com.expensecontrol.appclean.endpoint;

import com.expensecontrol.appclean.ExpenseController;
import com.expensecontrol.appclean.presenter.ExpensePresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/expense")
public class AddExpenseController {

    @Autowired
    private ExpenseController expenseController;

    @PostMapping("add")
    public ResponseEntity<ExpensePresenter> addExpense(@RequestBody ExpensePresenter expensePresenter) {
        return ResponseEntity.ok(expenseController.createExpense(expensePresenter));
    }
}
