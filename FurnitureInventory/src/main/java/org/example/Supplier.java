package org.example;

public class Supplier {

    private int SupplierID;
    private String Suppname;


    public Supplier(int supplierID, String suppname) {
        SupplierID = supplierID;
        Suppname = suppname;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public String getSuppname() {
        return Suppname;
    }

    public void setSuppname(String suppname) {
        Suppname = suppname;
    }
}
