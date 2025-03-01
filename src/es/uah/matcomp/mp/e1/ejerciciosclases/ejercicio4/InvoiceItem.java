package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio4;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String i, String d, int q, double u) {
        id = i;
        desc = d;
        qty = q;
        unitPrice = u;

    }
    public String getId() {
        return id;


    }
    public String getDesc() {
        return desc;

    }
    public int getQty() {
        return qty;

    }
    public void setQty(int newQty) {
        qty = newQty;

    }
    public double getUnitPrice() {
        return unitPrice;

    }
    public void setUnitPrice(double newUnitPrice) {
        unitPrice = newUnitPrice;

    }
    public double getTotal() {
        return this.getUnitPrice()* this.getQty();

    }
    public String toString() {
        return "InvoiceItem [id = " + this.getId()+ ", desc= " + this.getDesc()+ ", qty=" + this.getQty()+ ", unitPrice= " + this.getUnitPrice()+ " ]";
    }




}



