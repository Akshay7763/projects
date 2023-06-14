package com.cybage.model;

import org.springframework.stereotype.Component;

@Component
public class Record {
    private int transactionId;
    //public Account account;
    // public Customer customer;
    //public Merchant merchant;
    public CardDetails cardDetails;



    public Record() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Record(int transactionId, CardDetails cardDetails) {
        this.transactionId = transactionId;
        //this.customer = customer;
        //this.merchant = merchant;
        this.cardDetails = cardDetails;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public CardDetails getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public Merchant getMerchant() {
//        return merchant;
//    }
//
//    public void setMerchant(Merchant merchant) {
//        this.merchant = merchant;
//    }

    @Override
    public String toString() {
        return "Record [transactionId=" + transactionId + ", cardDetails=" + cardDetails + "]";
    }
}


