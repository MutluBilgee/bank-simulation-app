package com.cydeo;

import com.cydeo.enums.AccountType;
import com.cydeo.dto.AccountDTO;
import com.cydeo.service.AccountService;
import com.cydeo.service.TransactionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class BankSimulationAppApplication {

    public static void main(String[] args) {
       ApplicationContext container = SpringApplication.run(BankSimulationAppApplication.class, args);

//       //get account and transaction service beans
        AccountService accountService = container.getBean(AccountService.class);
        TransactionService transactionService = container.getBean(TransactionService.class);
//
//        //create 2 accounts sender and receiver
//        AccountDTO sender = accountService.createNewAccount(BigDecimal.valueOf(70), new Date(), AccountType.CHECKING, 2L);
//        AccountDTO receiver = accountService.createNewAccount(BigDecimal.valueOf(50), new Date(), AccountType.SAVING, 3L);
//        AccountDTO receiver2 = accountService.createNewAccount(BigDecimal.valueOf(55), new Date(), AccountType.SAVING, 4L);
//        AccountDTO receiver3 = accountService.createNewAccount(BigDecimal.valueOf(60), new Date(), AccountType.SAVING, 5L);
//
//        accountService.listAllAccount().forEach(System.out::println);
//
//        transactionService.makeTransfer(sender, receiver, new BigDecimal(40), new Date(), "Transaction 1");
//        System.out.println("transactionService.findAllTransaction().get(0) = " + transactionService.findAllTransaction().get(0));
//
//        accountService.listAllAccount().forEach(System.out::println);
    }

}
