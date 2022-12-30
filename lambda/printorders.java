package com.lambda;

import java.util.ArrayList;
class Printorders {
    /*
    @Override
    public String toString() {
        return "Assignment4Q2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }
*/
    public Printorders(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int totalPrice;
    private String status;
    public static ArrayList<Printorders> listOfOrders(ArrayList<Printorders> orders) {
        ArrayList<Printorders> listOrders = new ArrayList<>();
        for(Printorders order:orders){
            if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>10000){
                System.out.println("Inside if");
                Printorders or = new Printorders(order.getTotalPrice(),order.getStatus());
                listOrders.add(or);
            }
        }

        return listOrders;
    }
    public static void main(String[] args) {
        Printorders a1 = new Printorders(10001,"ACCEPTED");
        Printorders a2 = new Printorders(1000,"ACCEPTED");
        Printorders a3 = new Printorders(10500,"COMPLETED");
        Printorders a4 = new Printorders(100,"ACCEPTED");
        Printorders a5 = new Printorders(10002,"ACCEPTED");
        Printorders a7 = new Printorders(50000,"COMPLETED");
        ArrayList<Printorders> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a7);
        System.out.println(list);
        System.out.println(listOfOrders(list));
    }
}
