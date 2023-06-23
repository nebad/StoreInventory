package org.example;
import java.util.ArrayList;


public class Transaction {

    ArrayList<Item> userscart = new ArrayList<Item>();

    public ArrayList<Item> getUserscart() {
        return userscart;
    }

    public void setUserscart(ArrayList<Item> userscart) {
        this.userscart = userscart;
    }

    private int transactionid = (int) Math.random();
    public void Transaction(int transactionId)
    {
        this.transactionid = transactionId;

    }

    public void Completesale()
    {
        //call the database manager to remove the items
        // from the mySQL database
    }



}
