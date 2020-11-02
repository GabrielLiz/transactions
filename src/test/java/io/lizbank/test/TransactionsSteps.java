package io.lizbank.test;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.lizbank.transactionapi.entities.TransactionEntity;
import io.lizbank.transactionapi.models.TransactionStatus;
import io.lizbank.transactionapi.models.TransactionStatusResponse;
import io.lizbank.transactionapi.repository.TransactionRepository;
import io.lizbank.transactionapi.transactionService.impl.TransactionServiceImpl;
import io.lizbank.transactionapi.utils.Constants;
import io.lizbank.transactionapi.utils.Util;

public class TransactionsSteps {

    @Autowired
    TransactionServiceImpl service;

    @Autowired
    TransactionRepository repository;

    public TransactionStatus status;
    public TransactionStatusResponse response;
    public TransactionEntity entity;

    //Scenario 1

    @Given("A transaction that is not stored in our system reference is {int} and {string}")
    public void aTransactionThatIsNotStoredInOurSystemReferenceAnd(int arg0, String arg1) {
        status= new TransactionStatus();
        status.reference(arg0);
        status.channel(arg1);

    }

    @When("I check the status from any channel")
    public void iCheckTheStatusFromAnyChannel() {
       response = service.findStatus(status);
    }

    @Then("The system returns the status {string}")
    public void theSystemReturnsTheStatusINVALID(String invalid) {
        Assertions.assertEquals(invalid,response.getStatus());
    }

    //Scenario 2

    @Given("A transaction that is stored in our system with the  reference is {int} and {string}")
    public void aTransactionThatIsStoredInOurSystemWithTheReferenceIsAnd(int arg0, String arg1) {
        status= new TransactionStatus();
        status.reference(arg0);
        status.channel(arg1);
        response = service.findStatus(status);

    }

    @When("I check the status from CLIENT or ATM channel")
    public void iCheckTheStatusFromCLIENTOrATMChannel() {
        response = service.findStatus(status);
    }

    @And("the transaction date is before today")
    public void theTransactionDateIsBeforeToday() {
        entity = repository.findByReferenceIs(status.getReference());
        Assertions.assertEquals(Constants.BEFORE_TODAY, Util.managementDate(entity.getTransactionDate()));
    }

    @Then("The system returns the status Settled {string}")
    public void theSystemReturnsTheStatus(String status) {
        Assertions.assertEquals(status,response.getStatus());

    }

    @And("the amount substracting the fee")
    public void theAmountSubstractingTheFee() {
        double AmountLessFee = entity.getAmount()-entity.getFee();
        Assertions.assertEquals(response.getAmount().doubleValue(),AmountLessFee);
    }

    //Scenario 3

    @When("I check the status from {string} channel")
    public void iCheckTheStatusFromChannel(String arg0) {
        Assertions.assertEquals(arg0,response.getStatus());
    }

    @And("the amount")
    public void theAmount() {
        Assertions.assertEquals(response.getAmount().doubleValue(),entity.getAmount());

    }

    @And("the fee")
    public void theFee() {
        Assertions.assertEquals(response.getFee().doubleValue(),entity.getFee());
    }

    //Scenario 4
    @And("the transaction date is equals to today")
    public void theTransactionDateIsEqualsToToday() {
        entity = repository.findByReferenceIs(status.getReference());
        Assertions.assertEquals(Constants.TODAY, Util.managementDate(entity.getTransactionDate()));
    }

    @When("I check the status from PENDING channel")
    public void iCheckTheStatusFromPENDINGChannel() {


    }

    @And("the transaction date is greater than today")
    public void theTransactionDateIsGreaterThanToday() {
        entity = repository.findByReferenceIs(status.getReference());
        Assertions.assertEquals(Constants.AFTER_TODAY, Util.managementDate(entity.getTransactionDate()));
    }

    @When("I check the status from CLIENT channel")
    public void iCheckTheStatusFromCLIENTChannel() {
    }

    @When("I check the status from ATM channel")
    public void iCheckTheStatusFromATMChannel() {
    }

    @When("I check the status from INTERNAL channel")
    public void iCheckTheStatusFromINTERNALChannel() {
    }
}
