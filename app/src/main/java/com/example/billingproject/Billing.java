package com.example.billingproject;

public class Billing {

    private int client_id;
    private String client_name;
    private String product_Name;
    private double prd_Price;
    private int prd_Qty;

    public Billing(){
        this.client_id=0;
        this.client_name="";
        this.product_Name="";
        this.prd_Price=0;
        this.prd_Qty=0;

    }

    public Billing(int client_id, String client_name, String product_Name, double prd_Price, int prd_Qty) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.product_Name = product_Name;
        this.prd_Price = prd_Price;
        this.prd_Qty = prd_Qty;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public double getPrd_Price() {
        return prd_Price;
    }

    public int getPrd_Qty() {
        return prd_Qty;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public void setPrd_Price(double prd_Price) {
        this.prd_Price = prd_Price;
    }

    public void setPrd_Qty(int prd_Qty) {
        this.prd_Qty = prd_Qty;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "client_id=" + client_id +
                ", client_name='" + client_name + '\'' +
                ", product_Name='" + product_Name + '\'' +
                ", prd_Price=" + prd_Price +
                ", prd_Qty=" + prd_Qty +
                '}';
    }

    // calculate method
}


