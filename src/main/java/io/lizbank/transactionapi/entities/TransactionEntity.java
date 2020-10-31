package io.lizbank.transactionapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "operations")
@Entity
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int reference;
    private String iban;
    private String transactionDate;
    private float amount;
    private float fee;
    private String description;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "TransactionEntity{" +
                "id=" + id +
                ", reference=" + reference +
                ", iban='" + iban + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", description='" + description + '\'' +
                '}';
    }
}



